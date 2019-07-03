package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Drugs;
import sb.java.spring.entity.Physicians;

public interface PhysiciansDao {

	//查询所有数据
	@Select("select * from physicians")
	public List<Physicians> findAllPhy();

	@Select ("select * from physicians where id = #{id}")
	public Physicians findPhyid(String id);

	@Select("select * from physicians where username like  CONCAT('%',username,'%') ")
	public List<Drugs> findNamephy(@Param("username") String username);
	
}
