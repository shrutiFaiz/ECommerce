package com.cjc.main.serviceimplementation;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Dealer;
import com.cjc.main.model.Employee;
import com.cjc.main.model.User;
import com.cjc.main.repository.AdminRepository;
import com.cjc.main.repository.DealerRepository;
import com.cjc.main.serviceinterface.AdminServiceI;


@Service
public class AdminServiceImpl implements AdminServiceI{
	
	@Autowired
	AdminRepository ar;
	
	@Autowired
	DealerRepository dr;

	@Autowired
	JavaMailSender sender;
 

 
	
   @Override
  public void saveEmployee(Employee e) 
	  {

           ar.save(e);
           this.sendemail(e, e.getUserDetails());
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

@Override
public Dealer getDealerById(Integer dealerId) {
	// TODO Auto-generated method stub
	return dr.findByDealerId(dealerId);
}

@Override
public void sendemail(Employee e1, User userDetails) {
	SimpleMailMessage message= new SimpleMailMessage();
	String subject="Welcome in Eshop company check your user-deatails for login";
	String adminEmail="kpatilk4@gmail.com";
	String text="Please Note  Your Username add password to login in in our app \n username is -"+userDetails.getUserName()+""
			+ " and password = "+userDetails.getPassword();

	
	message.setTo(e1.getEmployeeEmail());
	message.setFrom(adminEmail);
	message.setSubject(subject);
    message.setText(text);

	sender.send(message);
	System.out.println("Messege send to user successfully");

}




}
