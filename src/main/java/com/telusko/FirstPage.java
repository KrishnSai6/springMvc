package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.services.AddServices;

@Controller
public class FirstPage {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res) {
		
		String k = req.getParameter("user");
		int x = Integer.parseInt(req.getParameter("t1"));
		int Y = Integer.parseInt(req.getParameter("t2"));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add.jsp");
		
		AddServices obj = new AddServices();
		int z = obj.add(x, Y);
		
		mv.addObject("name", z);
		
		return mv;
	}

}
