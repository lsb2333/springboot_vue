package sb.java.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sb.java.spring.dao.DiseasecounselingDao;
import sb.java.spring.entity.Diseasecounseling;
import sb.java.spring.service.DiseasecounselingService;

@Service
@Transactional
public class DiseasecounselingServiceImpl implements DiseasecounselingService {

	@Autowired
	private DiseasecounselingDao diseasecounselingDao;

	@Override
	public List<Diseasecounseling> findAlldis() {
		return diseasecounselingDao.findAlldis();
	}
	
	
}
