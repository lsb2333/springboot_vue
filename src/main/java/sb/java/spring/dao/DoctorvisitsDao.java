package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Doctorvisits;

public interface DoctorvisitsDao {

	//添加医生问诊病历
	@Insert("insert into doctorvisits(username,title,describes,status) values (#{username},#{title},#{describes},#{username})")
	public int addDov(Doctorvisits doctorvisits);
	
	//查看所有医生问诊病历
	@Select("select * from doctorvisits")
	public List<Doctorvisits> findAllDoc();

}
