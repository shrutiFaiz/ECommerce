package com.cjc.main.serviceimplementation;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cjc.main.model.Dealer;
import com.cjc.main.model.Employee;
import com.cjc.main.repository.AdminRepository;
import com.cjc.main.repository.DealerRepository;
import com.cjc.main.serviceinterface.AdminServiceI;


@Service
public class AdminServiceImpl implements AdminServiceI{
	
	@Autowired
	AdminRepository ar;
	
	@Autowired
	DealerRepository dr;
 
	
   @Override
  public void saveEmployee(Employee e) 
	  {

           ar.save(e);
	  }

@Override
public List<Employee> getEmployee() {
	
	return ar.findAll();
}

@Override
public void saveDealer(Dealer d) {
	
	dr.save(d);
	
}

@Override
public List<Dealer> getDealer() {
	
	return dr.findAll();
}

}
