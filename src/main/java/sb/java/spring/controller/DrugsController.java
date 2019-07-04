package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Drugs;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.DrugsService;

@RestController
@RequestMapping//你这个接口有问题
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
	
	@RequestMapping(value="/selectdru/id={id}", method=RequestMethod.GET)
	public ResultModel selectdru(@PathVariable("id") String id) {
		
		Drugs onedru = drugsService.findrcid(id);
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(onedru);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
	
	@RequestMapping(value="/findName", method=RequestMethod.POST)
	public ResultModel findName(@RequestBody Drugs drugs) {
		
		int code = 200;
		System.out.println("username="+drugs);
		
		List<Drugs> findname = drugsService.findNameDru(drugs.getUsername());

		for(int i=0;i<findname.size();i++) {
			if(findname.get(i).getUsername()=="") {
				code = 11119;
			}
		}
		
		
		System.out.println(findname);
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(code);
		resultModel.setData(findname);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
}
