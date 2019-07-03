package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import sb.java.spring.entity.Customer;

public interface CustomerDao {
	
	//获取所有的用户
	@Select("select * from customer")
    List<Customer> getAllcus();

	//通过用户名查询数据库中已经存在的用户名密码
	@Select("select * from customer where username = #{username} and password = #{password}")
	public Customer findCus(@Param("username") String username,@Param("password") String password);
	
	//通过用户名邮箱查询数据库中已经存在的用户名邮箱
	@Select("select * from customer where username = #{username} and email = #{email}")
	public Customer findemailCus(@Param("username") String username,@Param("email") String email);
	
	
    //注册
	@Insert("insert into customer(username,password,names,email,phone,status) values (#{username},#{password},#{names},#{email},#{phone},1)")
	int  addCus(Customer customer);
	
	
    //修改用户信息
	@Update("update customer set password=#{password} where username=#{username} and email = #{email}")
    int updateUser(Customer customer);
    

}
