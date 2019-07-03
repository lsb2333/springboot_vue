package sb.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sb.java.spring.entity.Customer;
import sb.java.spring.result.ResultModel;
import sb.java.spring.result.ResultModelTool;
import sb.java.spring.service.CustomerService;

@RestController
@RequestMapping(value = "app")
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/listcus", method = RequestMethod.GET)
	public ResultModel listCus() {
		List<Customer> cusList = customerService.getAllCus();
//        Map<String,List<Customer>> UserMap = new HashMap<>();
//        if (cusList!=null){	
//            UserMap.put("users",cusList);
//        }
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(200);
        resultModel.setData(cusList);
        return ResultModelTool.handleResultModel(resultModel);
		
	}
	
	@RequestMapping(value = "/regcus", method = RequestMethod.POST)
    public ResultModel addUser(@RequestBody Customer customer){
		System.out.println(customer);
		int code = 200;
		List<Customer> list = customerService.getAllCus();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUsername().equals(customer.getUsername())) {
				code = 11111;
			}
		}
		if(customer.getUsername()=="" || customer.getPassword()=="") {
			code = 11112;
		}else if(code == 200) {
			customerService.addCus(customer);
		}
//        int errorCode = customerService.addCus(customer);
        System.out.println(customer.toString());
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(code);
        resultModel.setData(customer);
        return ResultModelTool.handleResultModel(resultModel);
    }

	
	
	@RequestMapping(value = "/logincus", method = RequestMethod.POST)
    public ResultModel login(@RequestBody Customer customer){
		
		int code = 200;
//        int code = customerService.findCus(customer.getUsername(), customer.getPassword());
        Customer cus = customerService.findCus(customer.getUsername(), customer.getPassword());
        
        if(customer.getUsername()=="" || customer.getPassword()=="") {
			code = 12221;
	    }else if(cus == null){
	    	code = 10008;
	    }else if(customer.getUsername().equals(cus.getUsername()) && cus.getPassword().equals(cus.getPassword())) {
	    	code = 200;
	    }
//		if(customer.getUsername()=="" || customer.getPassword()=="") {
//        	code = 12221;
//        }
        System.out.println(customer);
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(code);
        resultModel.setData(cus);
        return ResultModelTool.handleResultModel(resultModel);
    }
	
	@RequestMapping(value = "/updatecus", method = RequestMethod.POST)
    public ResultModel updata(@RequestBody Customer customer){
		
		int code = 200;
        Customer cus = customerService.findemailCus(customer.getUsername(), customer.getEmail());
        System.out.println(cus);
        
        if(customer.getUsername()=="" || customer.getEmail()=="" || customer.getPassword()=="") {
			code = 10088;
	    }else if(cus == null){
	    	code = 10008;
	    }else if(customer.getUsername().equals(cus.getUsername()) && customer.getEmail().equals(cus.getEmail())) {
	    	customerService.updateUser(customer);
	    	code = 200;
	    }

        System.out.println(customer);
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(code);
        resultModel.setData(cus);
        return ResultModelTool.handleResultModel(resultModel);
    }
}
