
package com.kubelin.springsoap.vo.boxoffice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlRootElement(name = "searchDailyBoxOfficeList" , namespace="http://www.kobis.or.kr/kobisopenapi" )
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchDailyBoxOfficeList {
	
	@XmlElement(name="key"  )
    protected String key;
	@XmlElement(name="targetDt" )
    protected String targetDt;

    /**
     * key 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * key 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * targetDt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDt() {
        return targetDt;
    }

    /**
     * targetDt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDt(String value) {
        this.targetDt = value;
    }

	@Override
	public String toString() {
		return "SearchDailyBoxOfficeList [key=" + key + ", targetDt=" + targetDt + ", getKey()=" + getKey()
				+ ", getTargetDt()=" + getTargetDt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
    


}
