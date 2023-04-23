package soaptest.vo;

import java.util.Arrays;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "list")
public class XmlListTag {

    @XmlElement(name = "smart-phone")
    private List<SmartPhoneTag> smartPhoneTags;

	public List<SmartPhoneTag> getSmartPhoneTags() {
		return smartPhoneTags;
	}

	public void setSmartPhoneTags(List<SmartPhoneTag> smartPhoneTags) {
		this.smartPhoneTags = smartPhoneTags;
	}
    
	
}