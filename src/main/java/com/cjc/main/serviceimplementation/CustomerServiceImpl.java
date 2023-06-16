package com.cjc.main.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Customer;
import com.cjc.main.repository.CustomerRepository;
import com.cjc.main.serviceinterface.CustomerServiceI;
@Service
public class CustomerServiceImpl implements CustomerServiceI 
{
	
    @Autowired 
	CustomerRepository cr;
	@Override
	public void saveCustomer(Customer c)
	{
		// TODO Auto-generated method stub
		cr.save(c);
	}

}
