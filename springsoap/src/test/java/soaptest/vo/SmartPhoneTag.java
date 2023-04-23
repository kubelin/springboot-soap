package soaptest.vo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class SmartPhoneTag {

    @XmlElement(name = "model")
    private String model;

    @XmlElement(name = "price")
    private int price;

    @XmlElement(name = "firmware")
    private String firmware;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFirmware() {
		return firmware;
	}

	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}

	@Override
	public String toString() {
		return "SmartPhoneTag [model=" + model + ", price=" + price + ", firmware=" + firmware + "]";
	}
    
    
}