package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sb.java.spring.dao.CustomerDao;
import sb.java.spring.entity.Customer;
import sb.java.spring.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public int addCus(Customer customer) {
		return customerDao.addCus(customer);
    }

	@Override
	public List<Customer> getAllCus() {
		return customerDao.getAllcus();
	}


	@Override
	public int updateUser(Customer customer) {
		return customerDao.updateUser(customer);
	}

	@Override
	public Customer queryUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Customer findCus(String username, String password) {
		return customerDao.findCus(username, password);
	}


	@Override
	public Customer findemailCus(String username, String email) {
		return customerDao.findemailCus(username, email);
	}

	@Override
	public int deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
