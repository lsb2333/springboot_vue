package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Management;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.ManagementService;

@RestController
@RequestMapping
public class ManagementController {
	
	@Autowired
	private ManagementService managementService;
	
	@RequestMapping(value="listmag", method=RequestMethod.GET)
	public ResultModel findAllmag() {
		
		List<Management> listmag = managementService.findAllmag();
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(listmag);
		
		return ResultModelTool.handleResultModel(resultModel);
	}
}
