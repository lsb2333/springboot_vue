package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Physicians;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.PhysiciansService;

@RestController
@RequestMapping("phy")
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
}
