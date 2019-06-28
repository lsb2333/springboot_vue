package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sb.java.spring.dao.InformationDao;
import sb.java.spring.entity.Information;
import sb.java.spring.service.InformationService;

@Service
public class InformationServiceImpl implements InformationService {

	@Autowired
	private InformationDao informationDao;
	
	@Override 
	public List<Information> findAllinfo() {
		return informationDao.findAllinfo();
	}

}
