package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Information;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.InformationService;

@RestController
@RequestMapping(value="app")
@CrossOrigin("*")
public class InformationController {

	@Autowired
	private InformationService informationService;
	
	@RequestMapping(value="listinfo", method=RequestMethod.GET)
	public ResultModel listinfo() {
		
		List<Information> listinfo = informationService.findAllinfo();
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(listinfo);
		return ResultModelTool.handleResultModel(resultModel);
	}
}
