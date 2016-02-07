package pl.mg.carstore.repository;

import java.util.List;

import pl.mg.carstore.domain.Customer;

public interface CustomerRepository {
    public List<Customer> getAllCustomers();
}
