package soaptest.vo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Add", namespace = "http://tempuri.org/")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddRequest {
		@XmlElement(name="intA", namespace = "http://tempuri.org/")
	 	private Integer intA; // 첫 번째 숫자
		@XmlElement(name="intB", namespace = "http://tempuri.org/")
	    private Integer intB; // 두 번째 숫자
		//@XmlElement(name = "operation")
	    private String operation; // 연산자
		
		public AddRequest() {
		}

	    public int getIntA() {
			return intA;
		}

		public void setIntA(Integer intA) {
			this.intA = intA;
		}

		public Integer getIntB() {
			return intB;
		}



		public void setIntB(int intB) {
			this.intB = intB;
		}

		public String getOperation() {
	        return operation;
	    }

	    public void setOperation(String operation) {
	        this.operation = operation;
	    }


		@Override
		public String toString() {
			return "CalculatorRequest [intA=" + intA + ", intB=" + intB + ", operation=" + operation + ", getIntA()="
					+ getIntA() + ", getIntB()=" + getIntB() + ", getOperation()=" + getOperation() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
	    
	    
}
