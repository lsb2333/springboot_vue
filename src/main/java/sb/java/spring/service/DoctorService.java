package sb.java.spring.service;

import java.util.List;

import sb.java.spring.entity.Doctor;
import sb.java.spring.entity.Physicians;

public interface DoctorService {

	public List<Doctor> findAlldoc();

	public Physicians findocid(String id);
	
}
