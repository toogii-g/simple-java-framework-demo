package asd.dao;


import asd.domain.Customer;

public interface ICustomerDAO {
    public void save(Customer customer);
    public Customer find(String firstName);
}
