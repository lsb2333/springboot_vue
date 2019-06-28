package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Disease;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.DiseaseService;

@RestController
@RequestMapping(value="des")
@CrossOrigin("*")
public class DiseaseController {

	@Autowired
	private DiseaseService diseaseService;
	
	@RequestMapping(value="listdes", method=RequestMethod.GET)
	public ResultModel findAlldes() {
		
		List<Disease> listdes = diseaseService.findAlldes();
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(listdes);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
}
