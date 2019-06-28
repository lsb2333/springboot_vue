package sb.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.HealthInsurance;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.HealthInsuranceService;

@RestController
@RequestMapping(value="app")
@CrossOrigin("*")
public class HealthInsuranceController {

	@Autowired
	private HealthInsuranceService healthInsuranceService;
	
	@RequestMapping(value="addhir", method=RequestMethod.POST)
	public ResultModel addhir(@RequestBody HealthInsurance healthInsurance) {
		int code = 200;
		if(healthInsurance.getUsername()=="") {
			code = 10006;
		}else if(code == 200) {
			healthInsuranceService.addhir(healthInsurance);
			}
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(code);
		resultModel.setData(healthInsurance);
		return ResultModelTool.handleResultModel(resultModel);
		
	}
}
