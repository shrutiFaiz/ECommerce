package com.cjc.main.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cjc.main.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

}
