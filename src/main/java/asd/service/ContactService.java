package asd.service;

import asd.dao.IContactDAO;
import asd.domain.Contact;
import asd.integration.ILogger;
import framework.annotation.Autowired;
import framework.annotation.Service;

@Service
public class ContactService implements IContactService{
    @Autowired
    private IContactDAO iContactDAO;
    @Autowired
    private ILogger iLogger;

    public ContactService(){}


    public ContactService(ILogger iLogger){
        this.iLogger = iLogger;
    }

    public void addContact(String phone, String email){
        iContactDAO.save(new Contact(phone, email));
        iLogger.log("Contact created");
    }
}
