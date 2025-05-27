package academy.atl.customers.controllers;

import academy.atl.customers.entities.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private List<Customer> list = new ArrayList<>();

    public CustomerController() {
        Customer c = new Customer();
        c.setId(1);
        c.setFirstname("Aldahir");
        c.setLastname("Alonso");
        c.setEmail("alda123@hotmail.com");
        c.setAddress("Cuernavaca, Mexico");
        list.add(c);

        Customer c2 = new Customer();
        c2.setId(2);
        c2.setFirstname("Vivi");
        c2.setLastname("De la Rosa");
        c2.setEmail("vivichihuahua@hotmail.com");
        c2.setAddress("Tetela del Monte");
        list.add(c2);
    }

    @GetMapping("/customer/{id}") // Traer un Cliente Especifico
    public Customer getCustomer(@PathVariable Integer id) {
        for (Customer customer: list) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @GetMapping("/customer") // Traer Todos los Clientes
    public List<Customer> getAllCustomer() {
        return list;
    }

    @DeleteMapping("/customer/{id}") // Eliminar un Cliente
    public void removeCustomer(@PathVariable Integer id) {
        for (Customer customer: list) {
            if (customer.getId() == id) {
                list.remove(customer);
                break;
            }
        }
    }

    @PostMapping("/customer") // Agregar Cliente
    public void addCustomer(@RequestBody Customer customer) {
        list.add(customer);
    }

    @PutMapping("/customer/{id}") // Modificar Cliente
    public void updateCustomer(@PathVariable Integer id,
                               @RequestBody Customer updateCustomer) {
        for (Customer customer: list) {
            if (customer.getId() == id) {
                list.remove(customer);
                updateCustomer.setId(id);
                list.add(updateCustomer);
                break;
            }
        }
    }
}
