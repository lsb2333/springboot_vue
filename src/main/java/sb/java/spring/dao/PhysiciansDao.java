package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Physicians;

public interface PhysiciansDao {

	//查询所有数据
	@Select("select * from physicians")
	public List<Physicians> findAllPhy();
	
}
