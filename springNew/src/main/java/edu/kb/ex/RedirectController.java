package edu.kb.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RedirectController {
	
	@RequestMapping("/studentConfirm")
	public String studentRedirect(javax.servlet.http.HttpServletRequest HttpServletRequest, Model model) {
		String id = HttpServletRequest.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOk";
		}
		return "redirect:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk(Model model) {
		return "student/studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg(Model model) {
		return "student/studentNg";
	}
}
