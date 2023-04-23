
package com.kubelin.springsoap.vo.boxoffice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kubelin.springsoap.vo.boxoffice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _BoxOfficeResult_QNAME = new QName("http://www.kobis.or.kr/kobisopenapi", "boxOfficeResult");
    private static final QName _DailyBoxOffice_QNAME = new QName("http://www.kobis.or.kr/kobisopenapi", "dailyBoxOffice");
    private static final QName _OpenAPIFault_QNAME = new QName("http://www.kobis.or.kr/kobisopenapi", "OpenAPIFault");
    private static final QName _SearchDailyBoxOfficeListResponse_QNAME = new QName("http://www.kobis.or.kr/kobisopenapi", "searchDailyBoxOfficeListResponse");
    private static final QName _SearchDailyBoxOfficeList_QNAME = new QName("http://www.kobis.or.kr/kobisopenapi", "searchDailyBoxOfficeList");
    private static final QName _SearchWeeklyBoxOfficeListResponse_QNAME = new QName("http://www.kobis.or.kr/kobisopenapi", "searchWeeklyBoxOfficeListResponse");
    private static final QName _SearchWeeklyBoxOfficeList_QNAME = new QName("http://www.kobis.or.kr/kobisopenapi", "searchWeeklyBoxOfficeList");
    private static final QName _WeeklyBoxOffice_QNAME = new QName("http://www.kobis.or.kr/kobisopenapi", "weeklyBoxOffice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kubelin.springsoap.vo.boxoffice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DailyBoxOffice }
     * 
     * @return
     *     the new instance of {@link DailyBoxOffice }
     */
    public DailyBoxOffice createDailyBoxOffice() {
        return new DailyBoxOffice();
    }

    /**
     * Create an instance of {@link DailyBoxOfficeResult }
     * 
     * @return
     *     the new instance of {@link DailyBoxOfficeResult }
     */
    public DailyBoxOfficeResult createDailyBoxOfficeResult() {
        return new DailyBoxOfficeResult();
    }

    /**
     * Create an instance of {@link DailyBoxOfficeResult.DailyBoxOfficeList }
     * 
     * @return
     *     the new instance of {@link DailyBoxOfficeResult.DailyBoxOfficeList }
     */
    public DailyBoxOfficeResult.DailyBoxOfficeList createDailyBoxOfficeResultDailyBoxOfficeList() {
        return new DailyBoxOfficeResult.DailyBoxOfficeList();
    }

    /**
     * Create an instance of {@link OpenApiFaultBean }
     * 
     * @return
     *     the new instance of {@link OpenApiFaultBean }
     */
    public OpenApiFaultBean createOpenApiFaultBean() {
        return new OpenApiFaultBean();
    }

    /**
     * Create an instance of {@link SearchDailyBoxOfficeList }
     * 
     * @return
     *     the new instance of {@link SearchDailyBoxOfficeList }
     */
    public SearchDailyBoxOfficeList createSearchDailyBoxOfficeList() {
        return new SearchDailyBoxOfficeList();
    }

    /**
     * Create an instance of {@link SearchDailyBoxOfficeListResponse }
     * 
     * @return
     *     the new instance of {@link SearchDailyBoxOfficeListResponse }
     */
    public SearchDailyBoxOfficeListResponse createSearchDailyBoxOfficeListResponse() {
        return new SearchDailyBoxOfficeListResponse();
    }

    /**
     * Create an instance of {@link SearchWeeklyBoxOfficeList }
     * 
     * @return
     *     the new instance of {@link SearchWeeklyBoxOfficeList }
     */
    public SearchWeeklyBoxOfficeList createSearchWeeklyBoxOfficeList() {
        return new SearchWeeklyBoxOfficeList();
    }

    /**
     * Create an instance of {@link SearchWeeklyBoxOfficeListResponse }
     * 
     * @return
     *     the new instance of {@link SearchWeeklyBoxOfficeListResponse }
     */
    public SearchWeeklyBoxOfficeListResponse createSearchWeeklyBoxOfficeListResponse() {
        return new SearchWeeklyBoxOfficeListResponse();
    }

    /**
     * Create an instance of {@link WeeklyBoxOffice }
     * 
     * @return
     *     the new instance of {@link WeeklyBoxOffice }
     */
    public WeeklyBoxOffice createWeeklyBoxOffice() {
        return new WeeklyBoxOffice();
    }

    /**
     * Create an instance of {@link WeeklyBoxOfficeResult }
     * 
     * @return
     *     the new instance of {@link WeeklyBoxOfficeResult }
     */
    public WeeklyBoxOfficeResult createWeeklyBoxOfficeResult() {
        return new WeeklyBoxOfficeResult();
    }

    /**
     * Create an instance of {@link WeeklyBoxOfficeResult.WeeklyBoxOfficeList }
     * 
     * @return
     *     the new instance of {@link WeeklyBoxOfficeResult.WeeklyBoxOfficeList }
     */
    public WeeklyBoxOfficeResult.WeeklyBoxOfficeList createWeeklyBoxOfficeResultWeeklyBoxOfficeList() {
        return new WeeklyBoxOfficeResult.WeeklyBoxOfficeList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kobis.or.kr/kobisopenapi", name = "boxOfficeResult")
    public JAXBElement<Object> createBoxOfficeResult(Object value) {
        return new JAXBElement<>(_BoxOfficeResult_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyBoxOffice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DailyBoxOffice }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kobis.or.kr/kobisopenapi", name = "dailyBoxOffice")
    public JAXBElement<DailyBoxOffice> createDailyBoxOffice(DailyBoxOffice value) {
        return new JAXBElement<>(_DailyBoxOffice_QNAME, DailyBoxOffice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenApiFaultBean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpenApiFaultBean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kobis.or.kr/kobisopenapi", name = "OpenAPIFault")
    public JAXBElement<OpenApiFaultBean> createOpenAPIFault(OpenApiFaultBean value) {
        return new JAXBElement<>(_OpenAPIFault_QNAME, OpenApiFaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDailyBoxOfficeList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchDailyBoxOfficeList }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kobis.or.kr/kobisopenapi", name = "searchDailyBoxOfficeList")
    public JAXBElement<SearchDailyBoxOfficeList> createSearchDailyBoxOfficeList(SearchDailyBoxOfficeList value) {
        return new JAXBElement<>(_SearchDailyBoxOfficeList_QNAME, SearchDailyBoxOfficeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDailyBoxOfficeListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchDailyBoxOfficeListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kobis.or.kr/kobisopenapi", name = "searchDailyBoxOfficeListResponse")
    public JAXBElement<SearchDailyBoxOfficeListResponse> createSearchDailyBoxOfficeListResponse(SearchDailyBoxOfficeListResponse value) {
        return new JAXBElement<>(_SearchDailyBoxOfficeListResponse_QNAME, SearchDailyBoxOfficeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchWeeklyBoxOfficeList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchWeeklyBoxOfficeList }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kobis.or.kr/kobisopenapi", name = "searchWeeklyBoxOfficeList")
    public JAXBElement<SearchWeeklyBoxOfficeList> createSearchWeeklyBoxOfficeList(SearchWeeklyBoxOfficeList value) {
        return new JAXBElement<>(_SearchWeeklyBoxOfficeList_QNAME, SearchWeeklyBoxOfficeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchWeeklyBoxOfficeListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchWeeklyBoxOfficeListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kobis.or.kr/kobisopenapi", name = "searchWeeklyBoxOfficeListResponse")
    public JAXBElement<SearchWeeklyBoxOfficeListResponse> createSearchWeeklyBoxOfficeListResponse(SearchWeeklyBoxOfficeListResponse value) {
        return new JAXBElement<>(_SearchWeeklyBoxOfficeListResponse_QNAME, SearchWeeklyBoxOfficeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeeklyBoxOffice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WeeklyBoxOffice }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kobis.or.kr/kobisopenapi", name = "weeklyBoxOffice")
    public JAXBElement<WeeklyBoxOffice> createWeeklyBoxOffice(WeeklyBoxOffice value) {
        return new JAXBElement<>(_WeeklyBoxOffice_QNAME, WeeklyBoxOffice.class, null, value);
    }

}
