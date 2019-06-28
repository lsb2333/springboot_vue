package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Doctor;

public interface DoctorDao {

	@Select("select * from doctor")
	public List<Doctor> findAlldoc();
	
}
