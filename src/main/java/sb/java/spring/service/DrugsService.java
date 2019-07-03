package sb.java.spring.service;

import java.util.List;

import sb.java.spring.entity.Drugs;

public interface DrugsService {

	//查询所有药品
	public List<Drugs> findAllDru();
	
	//根据name模糊查询数据
	List<Drugs> findNameDru(String username);
	
}
