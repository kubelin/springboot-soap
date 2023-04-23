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
 * -> 
 * - 코드에 대한 설명 제공
 * - 코드 유효성 검증
 * 
 * [사용 방법]
 * - 이 클래스를 상속하여 공통 코드를 정의합니다.
 * - 코드 값과 코드에 대한 설명을 설정합니다.
 * - 코드 유효성 검증을 필요한 경우 해당 메서드를 오버라이드하여 구현합니다.
 *
 * [주의 사항]
 * - 코드 값과 코드 설명은 변경 가능한 변수로 설정되어 있어 필요에 따라 수정할 수 있습니다.
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
