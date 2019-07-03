package sb.java.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sb.java.spring.dao.HealthInsuranceDao;
import sb.java.spring.entity.HealthInsurance;
import sb.java.spring.service.HealthInsuranceService;

@Service
@Transactional
public class HealthInsuranceServiceImpl implements HealthInsuranceService {

	@Autowired
	private HealthInsuranceDao healthInsuranceDao;
	
	@Override
	public int addhir(HealthInsurance healthInsurance) {
		return healthInsuranceDao.addhir(healthInsurance);
	}

}
