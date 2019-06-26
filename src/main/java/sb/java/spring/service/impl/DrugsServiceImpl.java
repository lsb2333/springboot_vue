package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sb.java.spring.dao.DrugsDao;
import sb.java.spring.entity.Drugs;
import sb.java.spring.service.DrugsService;

@Service("drugsService")
public class DrugsServiceImpl implements DrugsService {

	@Autowired
	private DrugsDao drugsDao;
	
	@Override
	public List<Drugs> findAllDru() {
		return drugsDao.findAllDru();
	}

	@Override
	public List<Drugs> findNameDru(String name) {
		return drugsDao.findNameDru(name);
	}

}
