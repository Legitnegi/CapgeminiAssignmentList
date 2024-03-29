package com.gontuseries.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
   
	@RequestMapping(value="helooo",method= RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	}
	@RequestMapping(value="/submitAdmissionForm.html",method= RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName",defaultValue="Ashu")String name,@RequestParam("studentHobby")String hobby) {
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		model.addObject("msg","Detailed submitted by you:"+"Name: "+name+", Hobby: "+hobby);
		return model;
	
}
}
