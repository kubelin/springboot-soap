package soaptest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import soaptest.vo.AddRequest;
import soaptest.vo.SmartPhoneTag;
import soaptest.vo.XmlListTag;

public class SoapTest {
	
//	@Test
	@DisplayName("unmarshal 테스트")
	public void jaxbTest() throws JAXBException, IOException {

	    // Given
	    FileInputStream fileInputStream = new FileInputStream("src/test/java/soaptest/testdata1.xml");
	    JAXBContext jaxbContext = JAXBContext.newInstance(XmlListTag.class);
	    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

	    // When
	    XmlListTag xmlListTag = (XmlListTag) unmarshaller.unmarshal(fileInputStream);
	    
	    System.out.println(xmlListTag);
	    
	    fileInputStream.close();

	    // Then
	    assertNotNull(xmlListTag);
	    assertNotNull(xmlListTag.getSmartPhoneTags());
//	    assertEquals(4, xmlListTag.getSmartPhoneTags().length);
//	    assertEquals("iPhone", xmlListTag.getSmartPhoneTags()[0].getModel());
	}
	
	@Test
	@DisplayName("marshal 테스트2")
	public void jaxbMarshalTest2() throws JAXBException, IOException {

	    // Given
	    File file = new File("src/test/java/soaptest/outputdata5.xml");
	    JAXBContext jaxbContext = JAXBContext.newInstance(AddRequest.class);
	    Marshaller marshaller = jaxbContext.createMarshaller();

	    AddRequest cal = new AddRequest();
	    
	    cal.setIntA(1);
	    cal.setIntB(999);
	    cal.setOperation("Add");
	    
	    // When
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(cal, file);

	    FileInputStream fileInputStream = new FileInputStream(file);
	    byte[] bytes = fileInputStream.readAllBytes();
	    String content = new String(bytes);
	    
	    System.out.println(content);

	}
	
	
//	@Test
	@DisplayName("marshal 테스트")
	public void jaxbMarshalTest() throws JAXBException, IOException {

	    // Given
	    File file = new File("src/test/java/soaptest/outputdata4.xml");
	    JAXBContext jaxbContext = JAXBContext.newInstance(XmlListTag.class);
	    Marshaller marshaller = jaxbContext.createMarshaller();

	    XmlListTag xmlListTag = new XmlListTag();
	    List<SmartPhoneTag> smartPhoneTags = new ArrayList<>();	    
	    
	    SmartPhoneTag smartPhoneTag = new SmartPhoneTag();
	    smartPhoneTag.setModel("SAMSUNG");
	    smartPhoneTag.setPrice(123123);
	    
	    SmartPhoneTag smartPhoneTag2 = new SmartPhoneTag();
	    smartPhoneTag2.setModel("LG");
	    smartPhoneTag2.setPrice(9999999);
	    
	    SmartPhoneTag smartPhoneTag3 = new SmartPhoneTag();
	    smartPhoneTag3.setModel("SAMSUNG");
	    smartPhoneTag3.setPrice(123123);

	    smartPhoneTags.add(smartPhoneTag);
	    smartPhoneTags.add(smartPhoneTag2);
	    smartPhoneTags.add(smartPhoneTag3);
	    SmartPhoneTag[] sampleTest = new SmartPhoneTag[3];
	    sampleTest[0] = smartPhoneTag;
	    sampleTest[1] = smartPhoneTag2;
	    
	    xmlListTag.setSmartPhoneTags(smartPhoneTags);

	    // When
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(xmlListTag, file);

	    FileInputStream fileInputStream = new FileInputStream(file);
	    byte[] bytes = fileInputStream.readAllBytes();
	    String content = new String(bytes);
	    
	    System.out.println(content);

	    // Then
//	    assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
//	            "<list>\n" +
//	            "    <smart-phone>\n" +
//	            "        <model>샘성</model>\n" +
//	            "        <price>1230000</price>\n" +
//	            "        <firmware>1.2.3</firmware>\n" +
//	            "    </smart-phone>\n" +
//	            "    <smart-phone>\n" +
//	            "        <model>엘징</model>\n" +
//	            "        <price>1150000</price>\n" +
//	            "        <firmware>2.5</firmware>\n" +
//	            "    </smart-phone>\n" +
//	            "</list>\n", content);
	}
	
}
