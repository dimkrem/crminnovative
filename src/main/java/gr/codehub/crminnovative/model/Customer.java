package gr.codehub.crminnovative.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String name;
    private String address;

    public Customer(String name) {
        this.name=name;
    }
}
