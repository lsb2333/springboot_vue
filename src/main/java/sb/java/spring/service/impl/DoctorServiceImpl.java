package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sb.java.spring.dao.DoctorDao;
import sb.java.spring.entity.Doctor;
import sb.java.spring.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDao doctorDao;
	
	@Override
	public List<Doctor> findAlldoc() {
		return doctorDao.findAlldoc();
	}

}
