package com.kubelin.springsoap.vo.calc;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-04-24T01:29:01.960+09:00
 * Generated source version: 4.0.0
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "CalculatorSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface CalculatorSoap {

    @WebMethod(operationName = "Subtract", action = "http://tempuri.org/Subtract")
    @RequestWrapper(localName = "Subtract", targetNamespace = "http://tempuri.org/", className = "com.kubelin.springsoap.vo.calc.Subtract")
    @ResponseWrapper(localName = "SubtractResponse", targetNamespace = "http://tempuri.org/", className = "com.kubelin.springsoap.vo.calc.SubtractResponse")
    @WebResult(name = "SubtractResult", targetNamespace = "http://tempuri.org/")
    public int subtract(

        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB
    );

    @WebMethod(operationName = "Divide", action = "http://tempuri.org/Divide")
    @RequestWrapper(localName = "Divide", targetNamespace = "http://tempuri.org/", className = "com.kubelin.springsoap.vo.calc.Divide")
    @ResponseWrapper(localName = "DivideResponse", targetNamespace = "http://tempuri.org/", className = "com.kubelin.springsoap.vo.calc.DivideResponse")
    @WebResult(name = "DivideResult", targetNamespace = "http://tempuri.org/")
    public int divide(

        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB
    );

    /**
     * Adds two integers. This is a test WebService. ©DNE Online
     */
    @WebMethod(operationName = "Add", action = "http://tempuri.org/Add")
    @RequestWrapper(localName = "Add", targetNamespace = "http://tempuri.org/", className = "com.kubelin.springsoap.vo.calc.Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://tempuri.org/", className = "com.kubelin.springsoap.vo.calc.AddResponse")
    @WebResult(name = "AddResult", targetNamespace = "http://tempuri.org/")
    public int add(

        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB
    );

    @WebMethod(operationName = "Multiply", action = "http://tempuri.org/Multiply")
    @RequestWrapper(localName = "Multiply", targetNamespace = "http://tempuri.org/", className = "com.kubelin.springsoap.vo.calc.Multiply")
    @ResponseWrapper(localName = "MultiplyResponse", targetNamespace = "http://tempuri.org/", className = "com.kubelin.springsoap.vo.calc.MultiplyResponse")
    @WebResult(name = "MultiplyResult", targetNamespace = "http://tempuri.org/")
    public int multiply(

        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB
    );
}