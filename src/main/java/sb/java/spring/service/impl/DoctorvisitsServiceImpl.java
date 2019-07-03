package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sb.java.spring.dao.DoctorvisitsDao;
import sb.java.spring.entity.Doctorvisits;
import sb.java.spring.service.DoctorvisitsService;

@Service
@Transactional
public class DoctorvisitsServiceImpl implements DoctorvisitsService {

	@Autowired
	private DoctorvisitsDao doctorvisitsDao;
	
	@Override
	public int addDov(Doctorvisits doctorvisits) {
		return doctorvisitsDao.addDov(doctorvisits);
	}

	@Override
	public List<Doctorvisits> findAllDoc() {
		return doctorvisitsDao.findAllDoc();
	}

}
