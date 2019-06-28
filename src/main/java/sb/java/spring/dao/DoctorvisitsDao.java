package sb.java.spring.dao;

import org.apache.ibatis.annotations.Insert;

import sb.java.spring.entity.Doctorvisits;

public interface DoctorvisitsDao {

	//添加医生问诊病历
	@Insert("insert into doctorvisits(username,title,describes,status) values (#{username},#{title},#{describes},#{username})")
	public int addDov(Doctorvisits doctorvisits);

}
