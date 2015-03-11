package net.bounceme.doge.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ContactsSessionBean implements ContactsSessionBeanRemote {

    @EJB
    private ContactsFacadeLocal contactsFacade;

    //comment here
    
    
    @Override
    public String getAllContacts() {
      //  List<Contacts> all = contactsFacade.findAll();
        List<String> all = new ArrayList<>();
        all.add("fred");
        all.add("flinstone");
        all.add("barney");
        all.add("rubble");
        all.add("wilma");
        return all.toString();
    }

}
