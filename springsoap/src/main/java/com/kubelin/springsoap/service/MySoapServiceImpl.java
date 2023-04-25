package com.kubelin.springsoap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;

/**
 * [주요 기능]
 * - callWebService
 * -> webServiceTemplate로 soap통신을 호출
 * 
 * [사용 방법]
 * - MySoapService Class Autowired -> callWebService method 실행  
 * - Soap1.1, 1.2에 따라 필요한 method 사용
 * - 별도의 로직이 필요한 경우 해당 메서드를 오버라이드하여 구현합니다.
 *
 * [주의 사항]
 * - SoapActionCallback , WebServiceMessageCallback 은 동일기능을 수행합니다.
 * 
 * @created kubelin
 * @since 2023-04-23
 * @version 1.0
 */

@Service
public class MySoapServiceImpl implements MySoapService {

	@Autowired
	private WebServiceTemplate webServiceTemplate;

	public Object callWebService(Object request, String endpoint, String soapAction) throws Exception {
		 System.out.println("==== call callWebService ");
		 return webServiceTemplate.marshalSendAndReceive(
				 	endpoint,
		            request,
		            //new SoapActionCallback(soapAction)
		            new WebServiceMessageCallback() {
		                @Override
		                public void doWithMessage(WebServiceMessage message) {
		                    ((SoapMessage) message).setSoapAction(soapAction);
		                }
				 	}
		         );

		           /* 
		            * new WebServiceMessageCallback() {
		                @Override
		                public void doWithMessage(WebServiceMessage message) {
		                    ((SoapMessage) message).setSoapAction("http://tempuri.org/Add");
		                }
		            });*/
		
	}

	@Override
	public Object callWebService(Object request, String endpoint) throws Exception {
		 System.out.println("==== call callWebService ");
		 return webServiceTemplate.marshalSendAndReceive(
				    endpoint,
		            request
		         );
	}
	
	

}
