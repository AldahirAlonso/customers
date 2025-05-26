package academy.atl.customers.controllers;

import academy.atl.customers.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @GetMapping("/prueba")
    public String prueba() {
        return "Hola Mundo";
    }

    @GetMapping("/prueba2")
    public List<String> prueba2() {
        List<String> list = new ArrayList<>();
        list.add("Viviana");
        list.add("Aldahir");
        list.add("Alonso");
        return list;
    }

    @GetMapping("/prueba3")
    public Map<String, String> prueba3() {
        Map<String, String> map = new HashMap<>();
        map.put("nombre", "Aldahir");
        map.put("telefono", "123456");
        map.put("email", "aldahir12345@gmail.com");
        map.put("address", "Prolongacion Independencia");
        return map;
    }

    @GetMapping("/prueba4")
    public List<Customer> prueba4() {
        List<Customer> customers = new ArrayList<>();
        Customer a = new Customer();
        a.setFirstname("Aldahir");
        a.setLastname("Alonso");
        a.setEmail("aldahir0603@hotmail.com");
        a.setAddress("Cuernavaca, Mexico");
        customers.add(a);

        Customer v = new Customer();
        v.setFirstname("Vivi");
        v.setLastname("De la Rosa");
        v.setEmail("vivichihuahua@hotmail.com");
        v.setAddress("Tetela del Monte");
        customers.add(v);
        return customers;
    }
}
