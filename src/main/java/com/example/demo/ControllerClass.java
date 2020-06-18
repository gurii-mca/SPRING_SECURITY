package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	@Autowired
	UsersRepo repo;
	
@RequestMapping("/")
public String Welcome(HttpServletRequest request){
	request.setAttribute("MODE", "HOME");
	return "LoginPage.html";
}
@RequestMapping("/Login")
public String Doctor_login(HttpServletRequest request){
	request.setAttribute("MODE", "LOGIN");
	return "LoginPage.html";
}


@RequestMapping("/Doctor")
public String Auth_doctor(){
	
	return "Doctor_home.html";
}
@RequestMapping("/Staff")
public String Auth_staff(){
	
	return "Staff_home.html";
}

}
