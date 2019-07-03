package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sb.java.spring.dao.DiseaseDao;
import sb.java.spring.entity.Disease;
import sb.java.spring.service.DiseaseService;

@Service
@Transactional
public class DiseaseServiceImpl implements DiseaseService {

	@Autowired
	private DiseaseDao diseaseDao;
	
	@Override
	public List<Disease> findAlldes() {
		return diseaseDao.findAlldes();
	}

}
