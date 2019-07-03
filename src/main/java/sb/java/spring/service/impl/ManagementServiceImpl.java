package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sb.java.spring.dao.ManagementDao;
import sb.java.spring.entity.Management;
import sb.java.spring.service.ManagementService;

@Service
@Transactional
public class ManagementServiceImpl implements ManagementService {

	@Autowired
	private ManagementDao managementDao;
	
	@Override
	public List<Management> findAllmag() {
		return managementDao.findAllmag();
	}

}
