package com.example.sampleSpringMVC;
import java.util.ArrayList;
import java.util.List;
public class contactBusiness {
	    public List<contact> getContactList() {
	        List<contact> listContact = new ArrayList<>();
	        listContact.add(new contact("Marry John", "marry.john@gmail.com", "USA"));
	        listContact.add(new contact("Tom Smith", "tomsmith@outlook.com", "England"));
	        listContact.add(new contact("John Purcell", "john123@yahoo.com", "Australia"));
	        listContact.add(new contact("Siva Krishna", "sivakrishna@gmail.com", "India"));         
	        return listContact;
	    }
}
