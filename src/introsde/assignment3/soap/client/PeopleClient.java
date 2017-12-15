package introsde.assignment3.soap.client;

import introsde.assignment3.soap.ws.Activity;
import introsde.assignment3.soap.ws.ActivityType;
import introsde.assignment3.soap.ws.Person;
import introsde.assignment3.soap.ws.People;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import javax.xml.ws.Service;

public class PeopleClient{
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://introsdeass3.herokuapp.com/ws/people?wsdl");
        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.soap.assignment3.introsde/", "PeopleService");
        Service service = Service.create(url, qname);

        People people = service.getPort(People.class);
        
        /*try to : method #1*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Print server WSDL: " + url.toString());
        System.out.println("~");
        System.out.println("~");
        
        /*try to : method #1*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #1~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "personList()");
        System.out.println("Parameter: " + "nope");
        List<Person> personList = people.getPeopleList();
        System.out.println("Return: " + "List<Person>");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        for(Person p : personList) {
        	printPerson(p);
        }
        
        /*try to: method #2*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #2~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "readPerson(Long id)");
        System.out.println("Parameter: " + "660l");
        Person pino = people.readPerson(660l);
        System.out.println("Return: " + "Person");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        printPerson(pino);
        
        /*try to: method #3*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #3~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("NB: just changed the name of the person above with another random number");
        System.out.println("Name: " + "updatePerson(Person p)");
        System.out.println("Parameter: " + "the following person");
        pino.setFirstname("pino" + Math.random());
        printPerson(pino);
        pino = people.updatePerson(pino);
        people.readPerson(660l);
        System.out.println("Return: " + "Person");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        printPerson(pino);
        
        
        /*try to: method #4*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #4~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "createPerson(Person p)");
        System.out.println("Parameter: " + "the following person:");
        Person hole = new Person();
        hole.setFirstname("Hole"+Math.random());
        hole = people.createPerson(hole);
        printPerson(hole);
        System.out.println("Return: " + "Person");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        printPerson(hole);
        
        

        /*try to: method #5*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #5~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "deletePerson(Long id)");
        System.out.println("Parameter: " + hole.getIdPerson() + ": the id of The person just created");
        int i = people.deletePerson((long) hole.getIdPerson());
        System.out.println("Return: " + "int = 0 if OK, else int = -1 ");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        System.out.println(i);
        
        
        /*try to: method #6*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #6~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "readPersonPreferences(Long id, String activity_type)");
        System.out.println("Parameter: " + "660l, \"social\"");
        List<Activity> l= people.readPersonPreferences(660l, "Social");
        System.out.println("Return: " + "List<Activity> ");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        for(Activity a : l) {
        	printActivity(a);
        }
        
        
        /*try to: method #7*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #7~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "readPreferences()");
        System.out.println("Parameter: " + "nope");
        l= people.readPreferences();
        System.out.println("Return: " + "List<Activity> ");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        for(Activity a : l) {
        	printActivity(a);
        }
        

        /*try to: method #8*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #8~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "readPersonPreference(Long id,Long activity_id)");
        System.out.println("Parameter: " + "651l, 652l");
        Activity a = people.readPersonPreference(651l, 652l);
        System.out.println("Return: " + "Activity ");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        printActivity(a);

        /*try to: method #9*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #9~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "savePersonPreferences(Long id, Activity activity)");
        System.out.println("Parameter: " + "651l, the follwoing activity;");
        a.setName("I like bread");
        a.setDescription("with marmalade and butter");
        ActivityType s = new ActivityType();
        s.setTypeOf("eating pizza");
        a.setIdActivity(0);
        a.setType(s);
        a.setPlace("Povo 0");
        printActivity(a);
        people.savePersonPreference(651l, a);
        System.out.println("Return: " + "void");
        l= people.readPersonPreferences(651l, "Cultural");
        System.out.println("~");
        System.out.println("Let's check the activities of 651l(METHOD #6) in order to see if he hold it");
        System.out.println("~");
        System.out.println("Output: ");
        for(Activity b : l) {
        	printActivity(b);
        }
        
        
        /*try to: method #10*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #10~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "updatePersonPreference(Long id, Activity activity)");
        System.out.println("Parameter: " + "651l, the follwoing activity;");
        System.out.println("NB: just changed the name of the activity");
        a = (people.readPersonPreferences(651l, "eating pizza")).get(0);
        a.setName("I like honey");
        printActivity(a);
        a = people.updatePersonPreference(651l, a);
        System.out.println("Return: " + "void");
        System.out.println("~");
        System.out.println("Let's check the activitiy with METHOD #8 in order to see if it is changed");
        System.out.println("~");
        System.out.println("Output: ");
        printActivity(people.readPersonPreference(651l,(long) a.getIdActivity()));        
        
        
        /*try to: method #11*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #11~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "evaluatePersonPreferences(Long id, Activity activity, int value)");
        System.out.println("Parameter: " + "651l, the follwoing activity, 9");
        printActivity(a);
        a = people.evaluatePersonPreferences(651l, a, 9);
        System.out.println("Return: " + "Activity");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        printActivity(a);
        
        
        /*try to: method #12*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~method #12~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + "getBestPersonPreference(660l)");
        System.out.println("Parameter: " + "651l, the follwoing activity, 9");
        l= people.getBestPersonPreference(660l);
        System.out.println("Return: " + "List<Activity>");
        System.out.println("~");
        System.out.println("~");
        System.out.println("Output: ");
        for(Activity c : l) {
        	printActivity(c);
        }
    }
    
    private static void printPerson(Person p) {
    	System.out.println("[");
    	System.out.println("   Id: " + p.getIdPerson());
    	System.out.println("   First name: " + p.getFirstname());
    	System.out.println("   tLast name: " + p.getLastname());
    	System.out.println("   Birthdate: " + p.getBirthdate());
    	System.out.println("   Preferences: ");
    		for(Activity a : p.getPreferences()) {
    			printActivity(a);
    		}
        System.out.println("]");
    }
    
    private static void printActivity(Activity a) {
    	System.out.println("      [");
    	System.out.println("          Id: " + a.getIdActivity());
    	System.out.println("          Name: " + a.getName());
    	System.out.println("          Description: " + a.getDescription());
    	System.out.println("          Place: " + a.getPlace());
    	System.out.println("          Type: " + a.getType().getTypeOf());
    	System.out.println("          Startdate: " +a.getStartdate());
    	System.out.println("          Value: " +a.getValue());
        System.out.println("      ]");
    }
    
}