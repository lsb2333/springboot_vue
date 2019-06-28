package sb.java.spring.dao;

import org.apache.ibatis.annotations.Insert;

import sb.java.spring.entity.Emr;

public interface EmrDao {

	//添加电子病历
	@Insert("insert into emr(recordname,recordtime,username,treatmenttime,diseasetime,symptom,status) values (#{recordname},#{recordtime},#{username},#{treatmenttime},#{diseasetime},#{symptom},1)")
	public int addemr(Emr emr);
	
}
