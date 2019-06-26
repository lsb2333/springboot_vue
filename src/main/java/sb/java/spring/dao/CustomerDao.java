package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Customer;

public interface CustomerDao {
	
	//获取所有的用户
	@Select("select * from customer")
    List<Customer> getAllcus();

	//通过用户名查询数据库中已经存在的用户名密码
	@Select("select username,password from customer where username = #{username} and password = #{password}")
	public Customer findCus(@Param("username") String username,@Param("password") String password);
	
    //注册
	@Insert("insert into customer(username,password) values (#{username},#{password})")
	int  addCus(Customer customer);
	
    //改
    int updateUser(Customer customer);
    
    //查
    Customer queryUser(Integer id);


}
