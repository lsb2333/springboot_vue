package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Management;

public interface ManagementDao {

	//查询所有健康数据
	@Select("select * from management")
	public List<Management> findAllmag();


	
}
