package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Disease;

public interface DiseaseDao {

	@Select("select * from disease")
	public List<Disease> findAlldes();

	@Select("select * from disease where id = #{id}")
	public Disease selectdse(String id);


}
