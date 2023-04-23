
package com.kubelin.springsoap.vo.boxoffice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>searchDailyBoxOfficeList complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>{@code
 * <complexType name="searchDailyBoxOfficeList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="targetDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="itemPerPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="multiMovieYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="repNationCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="wideAreaCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDailyBoxOfficeList", propOrder = {
    "key",
    "targetDt",
    "itemPerPage",
    "multiMovieYn",
    "repNationCd",
    "wideAreaCd"
})
public class SearchDailyBoxOfficeList {

    protected String key;
    protected String targetDt;
    protected String itemPerPage;
    protected String multiMovieYn;
    protected String repNationCd;
    protected String wideAreaCd;

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

    /**
     * itemPerPage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPerPage() {
        return itemPerPage;
    }

    /**
     * itemPerPage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPerPage(String value) {
        this.itemPerPage = value;
    }

    /**
     * multiMovieYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiMovieYn() {
        return multiMovieYn;
    }

    /**
     * multiMovieYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiMovieYn(String value) {
        this.multiMovieYn = value;
    }

    /**
     * repNationCd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepNationCd() {
        return repNationCd;
    }

    /**
     * repNationCd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepNationCd(String value) {
        this.repNationCd = value;
    }

    /**
     * wideAreaCd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWideAreaCd() {
        return wideAreaCd;
    }

    /**
     * wideAreaCd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWideAreaCd(String value) {
        this.wideAreaCd = value;
    }

}
