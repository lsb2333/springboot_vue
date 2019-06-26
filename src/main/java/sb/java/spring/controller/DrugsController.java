package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Drugs;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.DrugsService;

@RestController
@RequestMapping("drug")
@CrossOrigin("*")
public class DrugsController {
	
	@Autowired
	private DrugsService drugsService;
	
	@RequestMapping(value="/listdru", method=RequestMethod.GET)
	public ResultModel listDru() {
		
		List<Drugs> listdru = drugsService.findAllDru();
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(listdru);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
	
	
	@RequestMapping(value="/findName", method=RequestMethod.POST)
	public ResultModel findName(@RequestBody String name) {
		
		System.out.println(name);
		List<Drugs> findname = drugsService.findNameDru("%仁%");
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(findname);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
}
