
package com.kubelin.springsoap.vo.boxoffice;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-04-25T21:47:12.042+09:00
 * Generated source version: 4.0.0
 */

@WebFault(name = "OpenAPIFault", targetNamespace = "http://www.kobis.or.kr/kobisopenapi")
public class OpenAPIFault extends Exception {

    private com.kubelin.springsoap.vo.boxoffice.OpenApiFaultBean faultInfo;

    public OpenAPIFault() {
        super();
    }

    public OpenAPIFault(String message) {
        super(message);
    }

    public OpenAPIFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public OpenAPIFault(String message, com.kubelin.springsoap.vo.boxoffice.OpenApiFaultBean openAPIFault) {
        super(message);
        this.faultInfo = openAPIFault;
    }

    public OpenAPIFault(String message, com.kubelin.springsoap.vo.boxoffice.OpenApiFaultBean openAPIFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = openAPIFault;
    }

    public com.kubelin.springsoap.vo.boxoffice.OpenApiFaultBean getFaultInfo() {
        return this.faultInfo;
    }
}
