package sb.java.spring.service;

import java.util.List;

import sb.java.spring.entity.Doctorvisits;

public interface DoctorvisitsService {

	public int addDov(Doctorvisits doctorvisits);
	
	public List<Doctorvisits> findAllDoc();
}
