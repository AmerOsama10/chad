package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloworldController {

	@RequestMapping("/")
	public String mainMenu() {
		return "main-menu";
	}

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showPage() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-data";
	}

	// new a controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {

		// read the request parameter from the html form
		String theName = request.getParameter("studentName");

		// convert the data to upper case
		theName = theName.toUpperCase();

		// create the message
		String message = "Hey from v2! " + theName;

		// add the message to the model
		model.addAttribute("message", message);

		return "helloworld-model";
	}

	// RequestParam -> spring will do it for us  String theName = request.getParameter("studentName");
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		// convert the data to upper case
		theName = theName.toUpperCase();

		// create the message
		String message = "Hey My friend from v3! " + theName;

		// add the message to the model
		model.addAttribute("message", message);

		return "helloworld-model";
	}

}
