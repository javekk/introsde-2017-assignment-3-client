
package introsde.assignment3.soap.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.assignment3.soap.ws package. 
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

    private final static QName _ReadPersonPreference_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonPreference");
    private final static QName _ReadPersonPreferences_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonPreferences");
    private final static QName _SavePersonPreference_QNAME = new QName("http://ws.soap.assignment3.introsde/", "savePersonPreference");
    private final static QName _Activity_QNAME = new QName("http://ws.soap.assignment3.introsde/", "activity");
    private final static QName _ReadPreferences_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPreferences");
    private final static QName _UpdatePersonPreferenceResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "updatePersonPreferenceResponse");
    private final static QName _ReadPersonPreferencesResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonPreferencesResponse");
    private final static QName _GetBestPersonPreferenceResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "getBestPersonPreferenceResponse");
    private final static QName _ActivityType_QNAME = new QName("http://ws.soap.assignment3.introsde/", "activity_type");
    private final static QName _EvaluatePersonPreferences_QNAME = new QName("http://ws.soap.assignment3.introsde/", "evaluatePersonPreferences");
    private final static QName _ReadPreferencesResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPreferencesResponse");
    private final static QName _GetBestPersonPreference_QNAME = new QName("http://ws.soap.assignment3.introsde/", "getBestPersonPreference");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "deletePersonResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.soap.assignment3.introsde/", "createPerson");
    private final static QName _EvaluatePersonPreferencesResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "evaluatePersonPreferencesResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "createPersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.soap.assignment3.introsde/", "deletePerson");
    private final static QName _SavePersonPreferenceResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "savePersonPreferenceResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.soap.assignment3.introsde/", "updatePerson");
    private final static QName _ReadPersonPreferenceResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonPreferenceResponse");
    private final static QName _GetPeopleList_QNAME = new QName("http://ws.soap.assignment3.introsde/", "getPeopleList");
    private final static QName _GetPeopleListResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "getPeopleListResponse");
    private final static QName _Person_QNAME = new QName("http://ws.soap.assignment3.introsde/", "person");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPerson");
    private final static QName _UpdatePersonPreference_QNAME = new QName("http://ws.soap.assignment3.introsde/", "updatePersonPreference");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "updatePersonResponse");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.assignment3.soap.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdatePersonPreferenceResponse }
     * 
     */
    public UpdatePersonPreferenceResponse createUpdatePersonPreferenceResponse() {
        return new UpdatePersonPreferenceResponse();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link ReadPreferences }
     * 
     */
    public ReadPreferences createReadPreferences() {
        return new ReadPreferences();
    }

    /**
     * Create an instance of {@link SavePersonPreference }
     * 
     */
    public SavePersonPreference createSavePersonPreference() {
        return new SavePersonPreference();
    }

    /**
     * Create an instance of {@link ReadPersonPreferences }
     * 
     */
    public ReadPersonPreferences createReadPersonPreferences() {
        return new ReadPersonPreferences();
    }

    /**
     * Create an instance of {@link ReadPersonPreference }
     * 
     */
    public ReadPersonPreference createReadPersonPreference() {
        return new ReadPersonPreference();
    }

    /**
     * Create an instance of {@link ReadPreferencesResponse }
     * 
     */
    public ReadPreferencesResponse createReadPreferencesResponse() {
        return new ReadPreferencesResponse();
    }

    /**
     * Create an instance of {@link EvaluatePersonPreferences }
     * 
     */
    public EvaluatePersonPreferences createEvaluatePersonPreferences() {
        return new EvaluatePersonPreferences();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetBestPersonPreference }
     * 
     */
    public GetBestPersonPreference createGetBestPersonPreference() {
        return new GetBestPersonPreference();
    }

    /**
     * Create an instance of {@link ActivityType }
     * 
     */
    public ActivityType createActivityType() {
        return new ActivityType();
    }

    /**
     * Create an instance of {@link GetBestPersonPreferenceResponse }
     * 
     */
    public GetBestPersonPreferenceResponse createGetBestPersonPreferenceResponse() {
        return new GetBestPersonPreferenceResponse();
    }

    /**
     * Create an instance of {@link ReadPersonPreferencesResponse }
     * 
     */
    public ReadPersonPreferencesResponse createReadPersonPreferencesResponse() {
        return new ReadPersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link SavePersonPreferenceResponse }
     * 
     */
    public SavePersonPreferenceResponse createSavePersonPreferenceResponse() {
        return new SavePersonPreferenceResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link EvaluatePersonPreferencesResponse }
     * 
     */
    public EvaluatePersonPreferencesResponse createEvaluatePersonPreferencesResponse() {
        return new EvaluatePersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link GetPeopleListResponse }
     * 
     */
    public GetPeopleListResponse createGetPeopleListResponse() {
        return new GetPeopleListResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonPreference }
     * 
     */
    public UpdatePersonPreference createUpdatePersonPreference() {
        return new UpdatePersonPreference();
    }

    /**
     * Create an instance of {@link ReadPersonPreferenceResponse }
     * 
     */
    public ReadPersonPreferenceResponse createReadPersonPreferenceResponse() {
        return new ReadPersonPreferenceResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetPeopleList }
     * 
     */
    public GetPeopleList createGetPeopleList() {
        return new GetPeopleList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonPreference")
    public JAXBElement<ReadPersonPreference> createReadPersonPreference(ReadPersonPreference value) {
        return new JAXBElement<ReadPersonPreference>(_ReadPersonPreference_QNAME, ReadPersonPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonPreferences")
    public JAXBElement<ReadPersonPreferences> createReadPersonPreferences(ReadPersonPreferences value) {
        return new JAXBElement<ReadPersonPreferences>(_ReadPersonPreferences_QNAME, ReadPersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "savePersonPreference")
    public JAXBElement<SavePersonPreference> createSavePersonPreference(SavePersonPreference value) {
        return new JAXBElement<SavePersonPreference>(_SavePersonPreference_QNAME, SavePersonPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPreferences")
    public JAXBElement<ReadPreferences> createReadPreferences(ReadPreferences value) {
        return new JAXBElement<ReadPreferences>(_ReadPreferences_QNAME, ReadPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonPreferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "updatePersonPreferenceResponse")
    public JAXBElement<UpdatePersonPreferenceResponse> createUpdatePersonPreferenceResponse(UpdatePersonPreferenceResponse value) {
        return new JAXBElement<UpdatePersonPreferenceResponse>(_UpdatePersonPreferenceResponse_QNAME, UpdatePersonPreferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonPreferencesResponse")
    public JAXBElement<ReadPersonPreferencesResponse> createReadPersonPreferencesResponse(ReadPersonPreferencesResponse value) {
        return new JAXBElement<ReadPersonPreferencesResponse>(_ReadPersonPreferencesResponse_QNAME, ReadPersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPersonPreferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "getBestPersonPreferenceResponse")
    public JAXBElement<GetBestPersonPreferenceResponse> createGetBestPersonPreferenceResponse(GetBestPersonPreferenceResponse value) {
        return new JAXBElement<GetBestPersonPreferenceResponse>(_GetBestPersonPreferenceResponse_QNAME, GetBestPersonPreferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "activity_type")
    public JAXBElement<ActivityType> createActivityType(ActivityType value) {
        return new JAXBElement<ActivityType>(_ActivityType_QNAME, ActivityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluatePersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "evaluatePersonPreferences")
    public JAXBElement<EvaluatePersonPreferences> createEvaluatePersonPreferences(EvaluatePersonPreferences value) {
        return new JAXBElement<EvaluatePersonPreferences>(_EvaluatePersonPreferences_QNAME, EvaluatePersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPreferencesResponse")
    public JAXBElement<ReadPreferencesResponse> createReadPreferencesResponse(ReadPreferencesResponse value) {
        return new JAXBElement<ReadPreferencesResponse>(_ReadPreferencesResponse_QNAME, ReadPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPersonPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "getBestPersonPreference")
    public JAXBElement<GetBestPersonPreference> createGetBestPersonPreference(GetBestPersonPreference value) {
        return new JAXBElement<GetBestPersonPreference>(_GetBestPersonPreference_QNAME, GetBestPersonPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluatePersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "evaluatePersonPreferencesResponse")
    public JAXBElement<EvaluatePersonPreferencesResponse> createEvaluatePersonPreferencesResponse(EvaluatePersonPreferencesResponse value) {
        return new JAXBElement<EvaluatePersonPreferencesResponse>(_EvaluatePersonPreferencesResponse_QNAME, EvaluatePersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonPreferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "savePersonPreferenceResponse")
    public JAXBElement<SavePersonPreferenceResponse> createSavePersonPreferenceResponse(SavePersonPreferenceResponse value) {
        return new JAXBElement<SavePersonPreferenceResponse>(_SavePersonPreferenceResponse_QNAME, SavePersonPreferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonPreferenceResponse")
    public JAXBElement<ReadPersonPreferenceResponse> createReadPersonPreferenceResponse(ReadPersonPreferenceResponse value) {
        return new JAXBElement<ReadPersonPreferenceResponse>(_ReadPersonPreferenceResponse_QNAME, ReadPersonPreferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "getPeopleList")
    public JAXBElement<GetPeopleList> createGetPeopleList(GetPeopleList value) {
        return new JAXBElement<GetPeopleList>(_GetPeopleList_QNAME, GetPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "getPeopleListResponse")
    public JAXBElement<GetPeopleListResponse> createGetPeopleListResponse(GetPeopleListResponse value) {
        return new JAXBElement<GetPeopleListResponse>(_GetPeopleListResponse_QNAME, GetPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "updatePersonPreference")
    public JAXBElement<UpdatePersonPreference> createUpdatePersonPreference(UpdatePersonPreference value) {
        return new JAXBElement<UpdatePersonPreference>(_UpdatePersonPreference_QNAME, UpdatePersonPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

}
