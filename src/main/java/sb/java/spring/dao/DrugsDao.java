package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Drugs;

public interface DrugsDao {

	//查询所有药品
	@Select("select * from drugs")
	public List<Drugs> findAllDru();
	
	//根据name模糊查询数据
	@Select("select * from drugs where name like '%${name}%'")
	public List<Drugs> findNameDru(@Param("name") String name);
	
}
