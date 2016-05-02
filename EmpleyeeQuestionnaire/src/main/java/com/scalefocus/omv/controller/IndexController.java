package com.scalefocus.omv.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.scalefocus.omv.service.EmployeeQuestionnaireService;

@Controller
public class IndexController {
	
	@Autowired
	private EmployeeQuestionnaireService employeeQuestionnaireService;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//    @ResponseBody
//    public ModelAndView showIndex() {
//		System.out.println("TBD from controller show index");
//		ModelAndView mv = new ModelAndView("index.jsp");
//		
//		return mv;
//    }
//	
//	@RequestMapping(value = "/user", method = RequestMethod.POST)
//    @ResponseBody
//    public ModelAndView createUser() {
//		System.out.println("TBD from controller");
//		employeeQuestionnaireService.createUser("Pencho", "Dimitrov", "primitrov", "pass");
//		System.out.println("TBD after create obj");
//		ModelAndView mv = new ModelAndView("index.jsp");
//		
//		return mv;
//    }
	
	@RequestMapping(value="/user")
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
        String lastname = request.getParameter("lastname");
        String firstname = request.getParameter("firstname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        
        System.out.println("TBD from user controller");
		employeeQuestionnaireService.createUser(firstname, lastname, username, password);
		System.out.println("TBD after create obj");		
        return new ModelAndView("user.jsp");
    }
	
	
}
