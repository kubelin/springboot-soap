package com.kubelin.springsoap.controller;

import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kubelin.springsoap.service.MySoapService;
import com.kubelin.springsoap.vo.boxoffice.BoxOfficeAPIServiceImplService;
import com.kubelin.springsoap.vo.boxoffice.DailyBoxOfficeResult;
import com.kubelin.springsoap.vo.boxoffice.DailyBoxOfficeResult.DailyBoxOfficeList;
import com.kubelin.springsoap.vo.boxoffice.SearchDailyBoxOfficeList;
import com.kubelin.springsoap.vo.boxoffice.SearchDailyBoxOfficeListResponse;
import com.kubelin.springsoap.vo.calc.AddRequest;
import com.kubelin.springsoap.vo.calc.AddResponse;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

@Controller
public class TestController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	MySoapService soapClient;

    /**
     * basic sample with soapAction
     * @return
     * createDate : 2023. 4. 24.
     */
	@GetMapping("/testSoap")
	public String testSoap() {
	    logger.info("======= Call testSoap");
	    try {
	    	// SOAP 웹 서비스 호출 from local wsdl
	 		AddRequest calReq = new AddRequest();
	 		AddResponse calRes = new AddResponse();
	 		
	 		calReq.setIntA(332);
	 		calReq.setIntB(11);
	 		calReq.setOperation("Add");
	 		
	 		logger.info(calReq.toString());
	 		logger.info(soapClient.callWebService(calReq, "http://www.dneonline.com/calculator.asmx?wsdl", "http://tempuri.org/Add").toString());
	 		logger.info("=== end of testSoap ");
		    
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	  
	    return "index";
	}
	
	/**
	 * basic sample without soapAction
	 * @return
	 * createDate : 2023. 4. 24.
	 */
	@GetMapping("/testSoap2")
	public String testSoap2() {
		logger.info("======= Call testSoap2");
		
		  try {
		    	// SOAP 웹 서비스 호출 from web wsdl
		 		SearchDailyBoxOfficeList searchDailyRequest = new SearchDailyBoxOfficeList();
		 		searchDailyRequest.setKey("f5eef3421c602c6cb7ea224104795888");
		 		searchDailyRequest.setTargetDt("20120101");
		 		
		 		String soapEndPoint = "http://www.kobis.or.kr/kobisopenapi/webservice/soap/boxoffice?wsdl";
		 		String soapAction = "";		 		
		 		SearchDailyBoxOfficeListResponse rearchDailyResponse = new SearchDailyBoxOfficeListResponse();
		 		DailyBoxOfficeResult dailyBoxOffice = new DailyBoxOfficeResult();
		 		DailyBoxOfficeList dbList = new DailyBoxOfficeList();
		 		rearchDailyResponse.setReturn(dailyBoxOffice);
		 		

		 		JAXBElement<?> response =  (JAXBElement<?>) soapClient.callWebService(searchDailyRequest, soapEndPoint, soapAction);
		 		rearchDailyResponse = (SearchDailyBoxOfficeListResponse) response.getValue();
		 		dailyBoxOffice = rearchDailyResponse.getReturn();
		 		
		 		
		 		logger.info(dailyBoxOffice.getBoxofficeType());
		 		logger.info(dailyBoxOffice.getShowRange());
		 		logger.info(dailyBoxOffice.getDailyBoxOfficeList().toString());

		 		logger.info("=== end of testSoap2 ");
		 		
			    
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
		  
		  return "index";
	}
	
	/**
	 * 생성된 Service 활용
	 * @return
	 * createDate : 2023. 4. 24.
	 */
	@GetMapping("/testSoap3")
	public String testSoap3() {
		logger.info("======= Call testSoap3");
		
		  try {
		    	// SOAP 웹 서비스 호출 from web wsdl
		 		SearchDailyBoxOfficeList searchDailyRequest = new SearchDailyBoxOfficeList();
		 		searchDailyRequest.setKey("f5eef3421c602c6cb7ea224104795888");
		 		
		 		DailyBoxOfficeResult result = new BoxOfficeAPIServiceImplService().getBoxOfficeAPIServiceImplPort()
		 										.searchDailyBoxOfficeList("f5eef3421c602c6cb7ea224104795888", "10", "", "", "", "");
		 		
		 		System.out.println(result);
		 		logger.info("=== end of testSoap3 ");
		 		
			    
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
		  
		  return "index";
	}
	

	/**
	 * JAXBElement 객체를 XML 문자열로 출력
	 * @param jaxbElement
	 * @return
	 * @throws JAXBException
	 * createDate : 2023. 4. 24.
	 */
	public String jaxbElementToString(JAXBElement<?> jaxbElement) throws JAXBException {
	    Object value = jaxbElement.getValue();

	    JAXBContext jaxbContext = JAXBContext.newInstance(value.getClass());
	    Marshaller marshaller = jaxbContext.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    StringWriter stringWriter = new StringWriter();
	    marshaller.marshal(value, stringWriter);

	    return stringWriter.toString();
	}
	
	
}
