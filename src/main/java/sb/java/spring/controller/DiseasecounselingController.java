package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Diseasecounseling;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.DiseasecounselingService;

@RestController
@RequestMapping(value = "dis")
@CrossOrigin("*")
public class DiseasecounselingController {
	
	@Autowired
	private DiseasecounselingService diseasecounselingServicel;
	
	@RequestMapping(value = "/dislist", method = RequestMethod.GET)
	public ResultModel listDis() {
		List<Diseasecounseling> disList = diseasecounselingServicel.findAlldis();
//        Map<String,List<Diseasecounseling>> DisMap = new HashMap<>();
//        if (disList!=null){
//        	DisMap.put("DIS",disList);
//        }
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(200);
        resultModel.setData(disList);
        return ResultModelTool.handleResultModel(resultModel);
		
	}
	
	
}
