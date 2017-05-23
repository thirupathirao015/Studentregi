package student.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import student.model.Student;
import student.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentservice;

	@RequestMapping(value ="/hello", method = RequestMethod.POST)
	public ModelAndView saveArticle(@ModelAttribute("student") Student  student,
			BindingResult result) {
		
		studentservice.add(student);//addCustomer(customer);
		
		return new ModelAndView("redirect:/addstudent");
	}
	/*@RequestMapping(value ="/hello", method = RequestMethod.POST)
	public ModelAndView listCustomer() 
	{
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("student",  studentservice.getAllStudent());//Customerlist());

		return new ModelAndView("addstudent", model);
		
	}

	@RequestMapping(value ="/hello", method = RequestMethod.POST)
	public ModelAndView addArticle(@ModelAttribute("student") Student student,
			BindingResult result) {
		
		return new ModelAndView("addcustomer");
	}
*/
}
