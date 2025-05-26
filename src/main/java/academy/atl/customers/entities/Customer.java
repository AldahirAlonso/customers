package academy.atl.customers.entities;

import lombok.*;

@Data @Builder
public class Customer {
    private String firstname;
    private String lastname;
    private String email;
    private String address;

}
