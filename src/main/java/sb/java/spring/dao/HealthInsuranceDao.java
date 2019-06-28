package sb.java.spring.dao;

import org.apache.ibatis.annotations.Insert;

import sb.java.spring.entity.HealthInsurance;

public interface HealthInsuranceDao {

	//录入医保卡资料
	@Insert("insert into health_insurance(student_no,username,dept,grade,major,glass,card_no,id_no,mobile,start_date,end_date,hi_status) values"
			+ " (#{studentNo},#{username},#{dept},#{grade},#{major},#{glass},#{cardNo},#{idNo},#{mobile},#{startDate},#{endDate},#{hiStatus})")
	public int addhir(HealthInsurance healthInsurance);

}
