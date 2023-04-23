
package com.kubelin.springsoap.vo.boxoffice2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>dailyBoxOfficeResult complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>{@code
 * <complexType name="dailyBoxOfficeResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="boxofficeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="showRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dailyBoxOfficeList" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.kobis.or.kr/kobisopenapi}dailyBoxOffice" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dailyBoxOfficeResult", propOrder = {
    "boxofficeType",
    "showRange",
    "dailyBoxOfficeList"
})
public class DailyBoxOfficeResult {

    protected String boxofficeType;
    protected String showRange;
    protected DailyBoxOfficeResult.DailyBoxOfficeList dailyBoxOfficeList;

    /**
     * boxofficeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxofficeType() {
        return boxofficeType;
    }

    /**
     * boxofficeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxofficeType(String value) {
        this.boxofficeType = value;
    }

    /**
     * showRange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowRange() {
        return showRange;
    }

    /**
     * showRange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowRange(String value) {
        this.showRange = value;
    }

    /**
     * dailyBoxOfficeList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DailyBoxOfficeResult.DailyBoxOfficeList }
     *     
     */
    public DailyBoxOfficeResult.DailyBoxOfficeList getDailyBoxOfficeList() {
        return dailyBoxOfficeList;
    }

    /**
     * dailyBoxOfficeList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyBoxOfficeResult.DailyBoxOfficeList }
     *     
     */
    public void setDailyBoxOfficeList(DailyBoxOfficeResult.DailyBoxOfficeList value) {
        this.dailyBoxOfficeList = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://www.kobis.or.kr/kobisopenapi}dailyBoxOffice" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dailyBoxOffice"
    })
    public static class DailyBoxOfficeList {

        @XmlElement(namespace = "http://www.kobis.or.kr/kobisopenapi")
        protected List<DailyBoxOffice> dailyBoxOffice;

        /**
         * Gets the value of the dailyBoxOffice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the dailyBoxOffice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDailyBoxOffice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DailyBoxOffice }
         * 
         * 
         * @return
         *     The value of the dailyBoxOffice property.
         */
        public List<DailyBoxOffice> getDailyBoxOffice() {
            if (dailyBoxOffice == null) {
                dailyBoxOffice = new ArrayList<>();
            }
            return this.dailyBoxOffice;
        }

    }

}
