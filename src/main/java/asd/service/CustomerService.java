package asd.service;

import asd.event.CustomEvent;
import asd.dao.ICustomerDAO;
import asd.domain.Customer;
import asd.integration.ILogger;
import framework.annotation.Autowired;
import framework.annotation.Qualifier;
import framework.annotation.Service;
import framework.event.ApplicationEventPublisher;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    @Qualifier("MockCustomerDAO")
    private ICustomerDAO iCustomerDAO;
    private ILogger iLogger;

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public void setILogger(ILogger iLogger) {
        this.iLogger = iLogger;
    }

    public void addCustomer(String firstName, String lastName){
        iCustomerDAO.save(new Customer(firstName, lastName));
        iLogger.log("Customer created");
        iLogger.log(applicationEventPublisher.toString());
        applicationEventPublisher.publishEvent(new CustomEvent("Customer Created!"));
    }
}
