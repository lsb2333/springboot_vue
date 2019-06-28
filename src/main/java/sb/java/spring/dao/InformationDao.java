package sb.java.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import sb.java.spring.entity.Information;

public interface InformationDao {

	//查询通知信息
	@Select("select * from information")
	public List<Information> findAllinfo();
}
