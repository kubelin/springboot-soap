
package com.kubelin.springsoap.vo.boxoffice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>dailyBoxOffice complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>{@code
 * <complexType name="dailyBoxOffice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rankInten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rankOldAndNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="movieCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="movieNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="openDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="salesAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="salesShare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="salesInten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="salesChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="salesAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="audiCnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="audiInten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="audiChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="audiAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="scrnCnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="showCnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlRootElement(name = "dailyBoxOffice" , namespace="http://www.kobis.or.kr/kobisopenapi" )
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "dailyBoxOffice", propOrder = {
//    "rnum",
//    "rank",
//    "rankInten",
//    "rankOldAndNew",
//    "movieCd",
//    "movieNm",
//    "openDt",
//    "salesAmt",
//    "salesShare",
//    "salesInten",
//    "salesChange",
//    "salesAcc",
//    "audiCnt",
//    "audiInten",
//    "audiChange",
//    "audiAcc",
//    "scrnCnt",
//    "showCnt"
//})
public class DailyBoxOffice {

    protected String rnum;
    protected String rank;
    protected String rankInten;
    protected String rankOldAndNew;
    protected String movieCd;
    protected String movieNm;
    protected String openDt;
    protected String salesAmt;
    protected String salesShare;
    protected String salesInten;
    protected String salesChange;
    protected String salesAcc;
    protected String audiCnt;
    protected String audiInten;
    protected String audiChange;
    protected String audiAcc;
    protected String scrnCnt;
    protected String showCnt;

    /**
     * rnum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRnum() {
        return rnum;
    }

    /**
     * rnum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRnum(String value) {
        this.rnum = value;
    }

    /**
     * rank 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * rank 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * rankInten 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankInten() {
        return rankInten;
    }

    /**
     * rankInten 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankInten(String value) {
        this.rankInten = value;
    }

    /**
     * rankOldAndNew 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankOldAndNew() {
        return rankOldAndNew;
    }

    /**
     * rankOldAndNew 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankOldAndNew(String value) {
        this.rankOldAndNew = value;
    }

    /**
     * movieCd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieCd() {
        return movieCd;
    }

    /**
     * movieCd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieCd(String value) {
        this.movieCd = value;
    }

    /**
     * movieNm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieNm() {
        return movieNm;
    }

    /**
     * movieNm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieNm(String value) {
        this.movieNm = value;
    }

    /**
     * openDt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenDt() {
        return openDt;
    }

    /**
     * openDt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDt(String value) {
        this.openDt = value;
    }

    /**
     * salesAmt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAmt() {
        return salesAmt;
    }

    /**
     * salesAmt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAmt(String value) {
        this.salesAmt = value;
    }

    /**
     * salesShare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesShare() {
        return salesShare;
    }

    /**
     * salesShare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesShare(String value) {
        this.salesShare = value;
    }

    /**
     * salesInten 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesInten() {
        return salesInten;
    }

    /**
     * salesInten 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesInten(String value) {
        this.salesInten = value;
    }

    /**
     * salesChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChange() {
        return salesChange;
    }

    /**
     * salesChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChange(String value) {
        this.salesChange = value;
    }

    /**
     * salesAcc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAcc() {
        return salesAcc;
    }

    /**
     * salesAcc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAcc(String value) {
        this.salesAcc = value;
    }

    /**
     * audiCnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiCnt() {
        return audiCnt;
    }

    /**
     * audiCnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiCnt(String value) {
        this.audiCnt = value;
    }

    /**
     * audiInten 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiInten() {
        return audiInten;
    }

    /**
     * audiInten 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiInten(String value) {
        this.audiInten = value;
    }

    /**
     * audiChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiChange() {
        return audiChange;
    }

    /**
     * audiChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiChange(String value) {
        this.audiChange = value;
    }

    /**
     * audiAcc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiAcc() {
        return audiAcc;
    }

    /**
     * audiAcc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiAcc(String value) {
        this.audiAcc = value;
    }

    /**
     * scrnCnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrnCnt() {
        return scrnCnt;
    }

    /**
     * scrnCnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrnCnt(String value) {
        this.scrnCnt = value;
    }

    /**
     * showCnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowCnt() {
        return showCnt;
    }

    /**
     * showCnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowCnt(String value) {
        this.showCnt = value;
    }

	@Override
	public String toString() {
		return "DailyBoxOffice [rnum=" + rnum + ", rank=" + rank + ", rankInten=" + rankInten + ", rankOldAndNew="
				+ rankOldAndNew + ", movieCd=" + movieCd + ", movieNm=" + movieNm + ", openDt=" + openDt + ", salesAmt="
				+ salesAmt + ", salesShare=" + salesShare + ", salesInten=" + salesInten + ", salesChange="
				+ salesChange + ", salesAcc=" + salesAcc + ", audiCnt=" + audiCnt + ", audiInten=" + audiInten
				+ ", audiChange=" + audiChange + ", audiAcc=" + audiAcc + ", scrnCnt=" + scrnCnt + ", showCnt="
				+ showCnt + "]";
	}
    
}