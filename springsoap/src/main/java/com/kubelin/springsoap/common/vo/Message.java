package com.kubelin.springsoap.common.vo;

public class Message {
    String myMessage1;
    String myMessage2;
    String myMessage3;
    String myMessage4;
    
	public String getMyMessage1() {
		return myMessage1;
	}
	public void setMyMessage1(String myMessage1) {
		this.myMessage1 = myMessage1;
	}
	public String getMyMessage2() {
		return myMessage2;
	}
	public void setMyMessage2(String myMessage2) {
		this.myMessage2 = myMessage2;
	}
	public String getMyMessage3() {
		return myMessage3;
	}
	public void setMyMessage3(String myMessage3) {
		this.myMessage3 = myMessage3;
	}
	public String getMyMessage4() {
		return myMessage4;
	}
	public void setMyMessage4(String myMessage4) {
		this.myMessage4 = myMessage4;
	}
	@Override
	public String toString() {
		return "Message [myMessage1=" + myMessage1 + ", myMessage2=" + myMessage2 + ", myMessage3=" + myMessage3
				+ ", myMessage4=" + myMessage4 + ", getMyMessage1()=" + getMyMessage1() + ", getMyMessage2()="
				+ getMyMessage2() + ", getMyMessage3()=" + getMyMessage3() + ", getMyMessage4()=" + getMyMessage4()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
	
    
}
