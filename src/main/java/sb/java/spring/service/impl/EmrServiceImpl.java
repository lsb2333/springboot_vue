package sb.java.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sb.java.spring.dao.EmrDao;
import sb.java.spring.entity.Emr;
import sb.java.spring.service.EmrService;

@Service
@Transactional
public class EmrServiceImpl implements EmrService {

	@Autowired
	private EmrDao emrDao;
	
	@Override
	public int addemr(Emr emr) {
		return emrDao.addemr(emr);
	}

}
