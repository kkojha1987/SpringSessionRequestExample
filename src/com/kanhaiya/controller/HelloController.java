package com.kanhaiya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kanhaiya.beans.HelloRequestScopeData;
import com.kanhaiya.beans.HelloSessionScopeData;

@Controller
public class HelloController {

	@Autowired
	private HelloRequestScopeData requestscopehellodata;
	@Autowired
	private HelloSessionScopeData sessionscopehellodata;

	@RequestMapping(value = "/")
	public String hellodata(Model model) {
		model.addAttribute("requestscopedate", requestscopehellodata.getDate());
		model.addAttribute("sessionscopedate", sessionscopehellodata.getDate());
		return "hello";
	}
}
