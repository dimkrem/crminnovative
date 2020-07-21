package gr.codehub.crminnovative.repository;

import gr.codehub.crminnovative.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
/*
otan ena interface kanei implement allo interface tote to kanei extenf kai oxi implemnts
java persistence app = jpa , pairnei 2 klaseis kai vash aytwn (ustomer einai entiry class , integer einai to primary key
thn ylopoihsh tou th kanei to idio to spring me to @Repository kata thn ekytelesh tou programmatos kanei vash ousiastika

*/


}
