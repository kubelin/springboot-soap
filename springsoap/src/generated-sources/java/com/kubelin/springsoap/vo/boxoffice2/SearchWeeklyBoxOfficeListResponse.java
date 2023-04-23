
package com.kubelin.springsoap.vo.boxoffice2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>searchWeeklyBoxOfficeListResponse complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>{@code
 * <complexType name="searchWeeklyBoxOfficeListResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://www.kobis.or.kr/kobisopenapi}weeklyBoxOfficeResult" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchWeeklyBoxOfficeListResponse", propOrder = {
    "_return"
})
public class SearchWeeklyBoxOfficeListResponse {

    @XmlElement(name = "return")
    protected WeeklyBoxOfficeResult _return;

    /**
     * return 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyBoxOfficeResult }
     *     
     */
    public WeeklyBoxOfficeResult getReturn() {
        return _return;
    }

    /**
     * return 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyBoxOfficeResult }
     *     
     */
    public void setReturn(WeeklyBoxOfficeResult value) {
        this._return = value;
    }

}
