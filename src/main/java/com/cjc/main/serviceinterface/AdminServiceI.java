package com.cjc.main.serviceinterface;

import java.util.List;

import com.cjc.main.model.Dealer;
import com.cjc.main.model.Employee;
import com.cjc.main.model.User;

public interface AdminServiceI {

	public void saveEmployee(Employee e);

	public List<Employee> getEmployee();

	public void saveDealer(Dealer d);

	public List<Dealer> getDealer();

	public Dealer getDealerById(Integer dealerId);
	public void sendemail(Employee e1, User userDetails);

	

}
