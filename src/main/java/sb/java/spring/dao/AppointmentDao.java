package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Appointment;

public interface AppointmentDao {

	//预约挂号
	@Insert("insert into appointment(username,treatmenttime,diseasetime,symptom,status) values (#{username},#{treatmenttime},#{diseasetime},#{symptom},1)")
	public int addapm(Appointment appointment);

	//查询所有
	@Select("select * from appointment")
	public List<Appointment> findAllapm();
	
}
