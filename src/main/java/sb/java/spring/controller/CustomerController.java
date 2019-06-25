package sb.java.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
@RequestMapping(value = "customer")
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public ResultModel listCus() {
		List<Customer> cusList = customerService.getAllCus();
        Map<String,List<Customer>> UserMap = new HashMap<>();
        if (cusList!=null){
            UserMap.put("users",cusList);
        }
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(1);
        resultModel.setData(UserMap);
        return ResultModelTool.handleResultModel(resultModel);
		
	}
	
	
	@RequestMapping(value = "/regcus", method = RequestMethod.POST)
    public ResultModel addUser(@RequestBody Customer customer){
		int errorCode = 1;
		List<Customer> list = customerService.getAllCus();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUsername().equals(customer.getUsername())) {
				errorCode = 11111;
			}
		}
		if(customer.getUsername()=="" || customer.getPassword()=="") {
			errorCode = 11112;
		}else if(errorCode == 1) {
			customerService.addCus(customer);
		}
//        int errorCode = customerService.addCus(customer);
        System.out.println(customer.toString());
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(errorCode);
        resultModel.setData(customer);
        return ResultModelTool.handleResultModel(resultModel);
    }

	
	
	@RequestMapping(value = "/logincus", method = RequestMethod.POST)
    public ResultModel login(@RequestBody Customer customer){
		
		int code = 1;
//        int code = customerService.findCus(customer.getUsername(), customer.getPassword());
        Customer cus = customerService.findCus2(customer.getUsername(), customer.getPassword());
        
        if(customer.getUsername()=="" || customer.getPassword()=="") {
			code = 12221;
	    }else if(cus == null){
	    	code = 12222;
	    }else if(customer.getUsername().equals(cus.getUsername()) && cus.getPassword().equals(cus.getPassword())) {
	    	code = 1;
	    }
//		if(customer.getUsername()=="" || customer.getPassword()=="") {
//        	code = 12221;
//        }
        System.out.println(customer);
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(code);
        resultModel.setData(customer);
        return ResultModelTool.handleResultModel(resultModel);
    }
}
