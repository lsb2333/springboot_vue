package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Doctor;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.DoctorService;

@RestController
@RequestMapping(value="doc")
@CrossOrigin("*")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(value="listdoc", method=RequestMethod.GET)
	public ResultModel listdoc() {
		
		List<Doctor> listdoc = doctorService.findAlldoc();
		
		ResultModel resultModel =new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(listdoc);
		
		return ResultModelTool.handleResultModel(resultModel);
	}
}
