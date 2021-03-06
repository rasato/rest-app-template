package ch72.net.api;

import ch72.net.domain.Customer;
import ch72.net.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by asato on 2016/07/27.
 */
@RestController
@RequestMapping("api/customers")
public class CustomerRestController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    List<Customer> getCustomers() {
        List<Customer> customers = customerService.findAll();
        return customers;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Customer getCustomer(@PathVariable Integer id) {
        Customer customer = customerService.findOne(id);
        return customer;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Customer postCustomer(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    Customer putCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
        customer.setId(id);
        return customerService.update(customer);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    void deleteCustomer(@PathVariable Integer id) {
        customerService.delete(id);
    }
}
