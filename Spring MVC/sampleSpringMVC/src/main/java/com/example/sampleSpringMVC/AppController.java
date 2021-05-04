package com.example.sampleSpringMVC;

import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class AppController {
     
    @RequestMapping("/list_contact")
    public String listContact(Model model) {
         
        contactBusiness business = new contactBusiness();
        List<contact> contactList = business.getContactList();
         
        model.addAttribute("contacts", contactList);       
         
        return "contact";
    }
}
