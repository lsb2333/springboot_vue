package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Appointment;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.AppointmentService;

@RestController
@RequestMapping
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@RequestMapping(value="addapm", method=RequestMethod.POST)
	public ResultModel addapm(@RequestBody Appointment appointment) {
		int code = 200;
		System.out.println(appointment);
		if(appointment.getUsername()=="") {
			code = 10006;
		}else if(code == 200) {
			appointmentService.addapm(appointment);
		}
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(code);
		resultModel.setData(appointment);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	} 
	
	
	@RequestMapping(value="listapm", method=RequestMethod.GET)
	public ResultModel listapm() {
		
		List<Appointment> listapm = appointmentService.findAllapm();
		
		ResultModel resultModel = new ResultModel();
		resultModel.setCode(200);
		resultModel.setData(listapm);
		
		return ResultModelTool.handleResultModel(resultModel);
		
	}
	
	
	
	
}
