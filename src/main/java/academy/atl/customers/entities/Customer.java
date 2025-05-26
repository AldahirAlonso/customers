package academy.atl.customers.entities;

import lombok.*;

import java.util.Objects;

// @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
// Data usa todas las funciones de arriba como Getter, Setter, etc.
@Data @Builder
public class Customer {
    private String firstname;
    private String lastname;
    private String email;
    private String address;


}
