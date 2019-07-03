package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sb.java.spring.dao.AppointmentDao;
import sb.java.spring.entity.Appointment;
import sb.java.spring.service.AppointmentService;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;
	
	@Override
	public int addapm(Appointment appointment) {
		return appointmentDao.addapm(appointment);
	}

	@Override
	public List<Appointment> findAllapm() {
		return appointmentDao.findAllapm();
	}
	
	 
}
