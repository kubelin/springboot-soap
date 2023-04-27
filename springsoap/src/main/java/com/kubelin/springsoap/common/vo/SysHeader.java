package com.kubelin.springsoap.common.vo;

public class SysHeader {
	String SysHeader;
	String SysBody;
	String SysTail;
	
	public String getSysHeader() {
		return SysHeader;
	}
	public void setSysHeader(String sysHeader) {
		SysHeader = sysHeader;
	}
	public String getSysBody() {
		return SysBody;
	}
	public void setSysBody(String sysBody) {
		SysBody = sysBody;
	}
	public String getSysTail() {
		return SysTail;
	}
	public void setSysTail(String sysTail) {
		SysTail = sysTail;
	}
	@Override
	public String toString() {
		return "SysHeader [SysHeader=" + SysHeader + ", SysBody=" + SysBody + ", SysTail=" + SysTail
				+ ", getSysHeader()=" + getSysHeader() + ", getSysBody()=" + getSysBody() + ", getSysTail()="
				+ getSysTail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
