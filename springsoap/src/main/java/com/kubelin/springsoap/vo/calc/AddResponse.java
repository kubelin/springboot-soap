package com.kubelin.springsoap.vo.calc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddResponse", namespace = "http://tempuri.org/")
@XmlAccessorType (XmlAccessType.FIELD)
public class AddResponse {
		
	    @XmlElement(name="AddResult", namespace = "http://tempuri.org/" )
	 	private int AddResult; // 결과값

	    @XmlElement(name = "faultstring")
	    private String message; // 메시지
	    
	    public AddResponse() {
		}
	    
	    // 생성자
	    public AddResponse(int AddResult, String message) {
	        this.AddResult = AddResult;
	        this.message = message;
	    }

	    // Getters and Setters
	    public int getAddResult() {
	        return AddResult;
	    }

	    public void setAddResult(int AddResult) {
	        this.AddResult = AddResult;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

		@Override
		public String toString() {
			return "CalculatorResponse [AddResult=" + AddResult + ", message=" + message + ", getAddResult()=" + getAddResult()
					+ ", getMessage()=" + getMessage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
	    
	    
}
