package pl.mg.carstore.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pl.mg.carstore.domain.Customer;

@Repository
public class InMemoryCustomerRepositoryImpl implements CustomerRepository {

    private static List<Customer> customers = new ArrayList<Customer>();

    static {
        Customer maciek = new Customer("1", "mac@gmail.com", "maciej g", "warszawa");
        Customer robert = new Customer("2", "rob@gmail.com", "robert w", "krakow");
        Customer mariusz = new Customer("3", "mariusz@gmail.com", "mariusz t", "warszawa");
        customers.add(maciek);
        customers.add(robert);
        customers.add(mariusz);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

}
