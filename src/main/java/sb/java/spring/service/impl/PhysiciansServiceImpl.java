package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sb.java.spring.dao.PhysiciansDao;
import sb.java.spring.entity.Drugs;
import sb.java.spring.entity.Physicians;
import sb.java.spring.service.PhysiciansService;

@Service
public class PhysiciansServiceImpl implements PhysiciansService {

	@Autowired
	private PhysiciansDao physiciansDao;
	
	@Override
	public List<Physicians> findAllPhy() {
		
		return physiciansDao.findAllPhy();
	}

	@Override
	public Physicians findPhyid(String id) {
		return physiciansDao.findPhyid(id);
	}

	@Override
	public List<Drugs> findNamephy(String username) {
		return physiciansDao.findNamephy(username);
	}

}
