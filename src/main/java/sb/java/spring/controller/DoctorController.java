package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Doctor;
import sb.java.spring.entity.Physicians;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.DoctorService;

@RestController
@RequestMapping
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
	
	@RequestMapping(value="/selectdoc/id={id}", method=RequestMethod.GET)
	public ResultModel selectphy(@PathVariable("id") String id) {
		
		Physicians onedru = doctorService.findocid(id);
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(onedru);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
}
