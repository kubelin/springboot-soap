package com.kubelin.springsoap.common.vo;

public class Common {
    String CommonHeader;
    String CommonBody;
    String CommonTail;
    
	public String getCommonHeader() {
		return CommonHeader;
	}
	public void setCommonHeader(String commonHeader) {
		CommonHeader = commonHeader;
	}
	public String getCommonBody() {
		return CommonBody;
	}
	public void setCommonBody(String commonBody) {
		CommonBody = commonBody;
	}
	public String getCommonTail() {
		return CommonTail;
	}
	public void setCommonTail(String commonTail) {
		CommonTail = commonTail;
	}
	
	@Override
	public String toString() {
		return "Common [CommonHeader=" + CommonHeader + ", CommonBody=" + CommonBody + ", CommonTail=" + CommonTail
				+ ", getCommonHeader()=" + getCommonHeader() + ", getCommonBody()=" + getCommonBody()
				+ ", getCommonTail()=" + getCommonTail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
	
}
