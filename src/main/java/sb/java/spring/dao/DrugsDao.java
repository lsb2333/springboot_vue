package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Drugs;

public interface DrugsDao {

	//查询所有药品
	@Select("select * from drugs")
	public List<Drugs> findAllDru();
	
	/*
	 * 增加一个DAO专门用于联合两个表查询数据。
	 * 查询得到的数据，专门封装成一个新的对象。
	 * select * from (
	 * select name as title, ... from 表1 where ....
	 * union
	 * select username  as title, ... from 表2 where ....)
	 */
	//根据name模糊查询数据
	@Select("select * from drugs where username like #{username}")
	public List<Drugs> findNameDru(@Param("username") String username);
	
	@Select("select * from drugs where id = #{id}")
	public Drugs findrcid(String id);
	
	
}
