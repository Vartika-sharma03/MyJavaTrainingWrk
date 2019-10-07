package com.customer.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.customer.model.*;
public interface CustomerRepository extends CrudRepository<Customer,Long>

{
	
	@Query(value="SELECT c from Customer c where c.name like '%' || :keyword || '%'"
			
			+ "OR c.email like '%' || :keyword || '%'"
			+ "OR c.address like '%' || :keyword || '%'")
	public List<Customer> search(@Param("keyword")String keyword);

}
