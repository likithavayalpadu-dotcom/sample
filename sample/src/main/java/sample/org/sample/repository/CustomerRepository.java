package sample.org.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.org.sample.entity.*;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
