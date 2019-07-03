package sb.java.spring.service;

import java.util.List;

import sb.java.spring.entity.Physicians;

public interface PhysiciansService {
	
	//查询所有数据
	public List<Physicians> findAllPhy();

	public Physicians findPhyid(String id);

	public List<Physicians> findNamephy(String username);

}
