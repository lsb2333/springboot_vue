package sb.java.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sb.java.spring.dao.DoctorvisitsDao;
import sb.java.spring.entity.Doctorvisits;
import sb.java.spring.service.DoctorvisitsService;

@Service
public class DoctorvisitsServiceImpl implements DoctorvisitsService {

	@Autowired
	private DoctorvisitsDao doctorvisitsDao;
	
	@Override
	public Doctorvisits addDov(Doctorvisits doctorvisits) {
		return doctorvisitsDao.addDov(doctorvisits);
	}

}
