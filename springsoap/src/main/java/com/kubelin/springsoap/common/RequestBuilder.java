package com.kubelin.springsoap.common;

import java.lang.reflect.Constructor;

import com.kubelin.springsoap.common.vo.Common;
import com.kubelin.springsoap.common.vo.SysHeader;
/**
 * [주요 기능]
 * - buildRequest 
 * -> header, common, message 구조의 객체 return, message는 object형태로서 가변적 
 * 
 * [사용 방법]
 * - buildRequest에 param으로 3개의 객체 사용
 *
 * @created kubelin
 * @since 2023-04-28
 * @version 1.0
 */
public class RequestBuilder {
  
    public static Object buildRequest(SysHeader header, Common common, Object message) {
        
    	Object returnRequest = null;
		try {
			Class<?> requestClass = Class.forName("com.kubelin.springsoap.common.vo.Request");
			
			Constructor<?> requestConstructor = requestClass.getConstructor(SysHeader.class, Common.class, Object.class);
			returnRequest = requestConstructor.newInstance(header, common, message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	
    	return returnRequest;
    	
    }
}
