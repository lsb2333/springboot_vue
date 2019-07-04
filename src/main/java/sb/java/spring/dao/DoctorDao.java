package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Doctor;
import sb.java.spring.entity.Physicians;

public interface DoctorDao {

	@Select("select * from doctor")
	public List<Doctor> findAlldoc();

	@Select("select * from doctor where id=#{id}")
	public Physicians findocid(String id);
	
}
