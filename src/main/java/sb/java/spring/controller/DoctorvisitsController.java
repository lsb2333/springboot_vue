package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Doctorvisits;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.DoctorvisitsService;

@RestController
@RequestMapping(value="app")
@CrossOrigin("*")
public class DoctorvisitsController {

	@Autowired
	private DoctorvisitsService doctorvisitsService;
	
	@RequestMapping(value="adddov", method=RequestMethod.POST)
	public ResultModel adddov(@RequestBody Doctorvisits doctorvisits) {
		int code = 200;
		if(doctorvisits.getUsername()=="") {
			code = 10006;
		}else if(code==200) {
			  doctorvisitsService.addDov(doctorvisits);
		}
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(code);
		resultModel.setData(doctorvisits);
		
		return ResultModelTool.handleResultModel(resultModel);
	}
	
	@RequestMapping(value="listdoc", method=RequestMethod.GET)
	public ResultModel listdoc() {
		
		List<Doctorvisits> listdoc = doctorvisitsService.findAllDoc();
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(listdoc);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
}
