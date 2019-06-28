package sb.java.spring.service;

import java.util.List;

import sb.java.spring.entity.Appointment;

public interface AppointmentService {

	//预约挂号
	public int addapm(Appointment appointment);

	public List<Appointment> findAllapm();
	
}
