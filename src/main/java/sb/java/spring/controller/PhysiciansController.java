package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Drugs;
import sb.java.spring.entity.Physicians;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.PhysiciansService;

@RestController
@RequestMapping("app")
@CrossOrigin("*")
public class PhysiciansController {

	@Autowired
	private PhysiciansService physiciansService;
	
	@RequestMapping(value="/listphy", method=RequestMethod.GET)
	public ResultModel listPhy() {
		
		List<Physicians> listdru = physiciansService.findAllPhy();
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(listdru);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}

	
	
	@RequestMapping(value="/selectphy/id={id}", method=RequestMethod.GET)
	public ResultModel selectphy(@PathVariable("id") String id) {
		
		Physicians onedru = physiciansService.findPhyid(id);
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(onedru);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
	
	@RequestMapping(value="/findNamephy", method=RequestMethod.POST)
	public ResultModel findName(@RequestBody String username) {
		
		System.out.println(username);
		List<Drugs> findnamephy = physiciansService.findNamephy("username");
		System.out.println(findnamephy);
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(findnamephy);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
}
