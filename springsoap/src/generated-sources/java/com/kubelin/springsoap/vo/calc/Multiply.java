
package com.kubelin.springsoap.vo.calc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "intA",
    "intB"
})
@XmlRootElement(name = "Multiply")
public class Multiply {

    protected int intA;
    protected int intB;

    /**
     * intA 속성의 값을 가져옵니다.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * intA 속성의 값을 설정합니다.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * intB 속성의 값을 가져옵니다.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * intB 속성의 값을 설정합니다.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}
