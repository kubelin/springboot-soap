package com.kubelin.springsoap.service;

import org.springframework.stereotype.Service;

import com.kubelin.springsoap.vo.calc.AddRequest;
import com.kubelin.springsoap.vo.calc.AddResponse;

@Service
public interface MySoapService {
	public Object callWebService(Object request, String endpoint) throws Exception;

	public Object callWebService(Object request, String endpoint, String soapAction) throws Exception;
}
