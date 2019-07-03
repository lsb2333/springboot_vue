package sb.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Emr;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.EmrService;

@RestController
@RequestMapping
public class EmrController {

	@Autowired
	private EmrService emrService;
	
	@RequestMapping(value="addemr")
	public ResultModel addEmr(@RequestBody Emr emr) {
		int code = 200;
		if(emr.getUsername()=="") {
			code = 10006;
		}
		if(code == 200) {
			emrService.addemr(emr);
		}
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(code);
		resultModel.setData(emr);
		return ResultModelTool.handleResultModel(resultModel);
		
	}
}
