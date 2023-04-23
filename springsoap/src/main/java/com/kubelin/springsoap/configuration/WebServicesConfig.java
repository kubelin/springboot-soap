package com.kubelin.springsoap.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

/**
 * [주요 기능]
 * - marshaller 
 * -> java를 wsdl 구조로 변환
 * - unmarshaller 
 * -> wsdl을 java 구조로 변환
 * - webServiceTemplate 
 * -> soap통신을위한 templateclass from springframework 
 * 
 * [사용 방법]
 * - marshaller, unmarshaller는 대상 package만 정의
 * - webServiceTemplate 시에는 url을 변경해서 사용. ( param or whatever )
 *
 * @created kubelin
 * @since 2023-04-23
 * @version 1.0
 */


@EnableWs
@Configuration
public class WebServicesConfig extends WsConfigurerAdapter {
		
	   @Bean
	    public MessageDispatcherServlet messageDispatcherServlet() {
	        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
	        servlet.setTransformWsdlLocations(true);
	        return servlet;
	    }
	   
	    @Bean
	    public Marshaller marshaller() {
	        // Marshaller 구현체를 생성하여 반환
	        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	        marshaller.setPackagesToScan("com.kubelin.springsoap.vo"); 
	        return marshaller;
	    }

	    @Bean
	    public Unmarshaller unmarshaller() {
	        // Unmarshaller 구현체를 생성하여 반환
	        Jaxb2Marshaller unmarshaller = new Jaxb2Marshaller();
	        unmarshaller.setPackagesToScan("com.kubelin.springsoap.vo"); 
	        return unmarshaller;
	    }
	    
	   @Bean
	    public WebServiceTemplate webServiceTemplate() {
	        WebServiceTemplate template = new WebServiceTemplate();
	        template.setDefaultUri("http://www.kobis.or.kr/kobisopenapi/webservice/soap/boxoffice?wsdl");
	        template.setMarshaller(marshaller()); // 마샬러 등록
	        template.setUnmarshaller(unmarshaller()); // 언마샬러 등록

	        return template;
	    }

	    @Bean
	    public SaajSoapMessageFactory messageFactory() {
	        return new SaajSoapMessageFactory();
	    }


}
