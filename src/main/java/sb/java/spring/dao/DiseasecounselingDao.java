package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Diseasecounseling;

public interface DiseasecounselingDao {

	//查询所有信息
	@Select("select * from diseasecounseling")
	public List<Diseasecounseling> findAlldis();
}
