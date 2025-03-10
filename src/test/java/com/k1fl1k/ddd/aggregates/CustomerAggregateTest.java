package com.k1fl1k.ddd.aggregates;

import static org.junit.jupiter.api.Assertions.*;

import com.k1fl1k.ddd.entities.Customer;
import com.k1fl1k.ddd.entities.Order;
import com.k1fl1k.ddd.valueobjects.Address;
import com.k1fl1k.ddd.valueobjects.Email;
import com.k1fl1k.ddd.valueobjects.Name;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class CustomerAggregateTest {

    @Test
    void shouldCreateValidCustomerAggregate() {
        UUID id = UUID.randomUUID();
        Name name = new Name("John", "Doe");
        Email email = new Email("john.doe@example.com");
        Address address = new Address("Ukraine", "Kyiv", "Street 1", "12345");

        CustomerAggregate customerAggregate = new CustomerAggregate(id, name, email, address);

        assertEquals(id, customerAggregate.getId());
        assertEquals(name, customerAggregate.getName());
        assertEquals(email, customerAggregate.getEmail());
        assertEquals(address, customerAggregate.getAddress());
    }

    @Test
    void shouldAddOrderToCustomerAggregate() {
        UUID id = UUID.randomUUID();
        Name name = new Name("John", "Doe");
        Email email = new Email("john.doe@example.com");
        Address address = new Address("Ukraine", "Kyiv", "Street 1", "12345");
        CustomerAggregate customerAggregate = new CustomerAggregate(id, name, email, address);

        Customer customer = new Customer(id, name, email, address);
        Order order = new Order(UUID.randomUUID(), customer, address);

        customerAggregate.addOrder(order);

        assertEquals(1, customerAggregate.getOrders().size());
    }

    @Test
    void shouldUpdateAddressInCustomerAggregate() {
        UUID id = UUID.randomUUID();
        Name name = new Name("John", "Doe");
        Email email = new Email("john.doe@example.com");
        Address oldAddress = new Address("Ukraine", "Kyiv", "Street 1", "12345");
        Address newAddress = new Address("Ukraine", "Lviv", "Street 2", "67890");

        CustomerAggregate customerAggregate = new CustomerAggregate(id, name, email, oldAddress);
        customerAggregate.updateAddress(newAddress);

        assertEquals(newAddress, customerAggregate.getAddress());
    }

    @Test
    void shouldReturnTrueForActiveOrders() {
        UUID id = UUID.randomUUID();
        Name name = new Name("John", "Doe");
        Email email = new Email("john.doe@example.com");
        Address address = new Address("Ukraine", "Kyiv", "Street 1", "12345");
        CustomerAggregate customerAggregate = new CustomerAggregate(id, name, email, address);

        Customer customer = new Customer(id, name, email, address);
        Order order = new Order(UUID.randomUUID(), customer, address);
        customerAggregate.addOrder(order);

        assertTrue(customerAggregate.hasActiveOrders());
    }
}
