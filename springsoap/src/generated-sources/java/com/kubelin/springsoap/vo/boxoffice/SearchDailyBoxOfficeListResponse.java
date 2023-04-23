
package com.kubelin.springsoap.vo.boxoffice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>searchDailyBoxOfficeListResponse complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>{@code
 * <complexType name="searchDailyBoxOfficeListResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://www.kobis.or.kr/kobisopenapi}dailyBoxOfficeResult" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDailyBoxOfficeListResponse", propOrder = {
    "_return"
})
public class SearchDailyBoxOfficeListResponse {

    @XmlElement(name = "return")
    protected DailyBoxOfficeResult _return;

    /**
     * return 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DailyBoxOfficeResult }
     *     
     */
    public DailyBoxOfficeResult getReturn() {
        return _return;
    }

    /**
     * return 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyBoxOfficeResult }
     *     
     */
    public void setReturn(DailyBoxOfficeResult value) {
        this._return = value;
    }

}
