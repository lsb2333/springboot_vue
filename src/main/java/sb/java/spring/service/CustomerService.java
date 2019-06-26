package sb.java.spring.service;

import java.util.List;

import sb.java.spring.entity.Customer;

public interface CustomerService {
	//获取所有的用户
    List<Customer> getAllCus();
        
    public Customer findCus(String username, String password);
    
    //增
    int addCus(Customer customer);
    //删
    int  deleteUser(Integer id);
    //改
    int updateUser(Customer customer);
    //查
    Customer queryUser(Integer id);
}
