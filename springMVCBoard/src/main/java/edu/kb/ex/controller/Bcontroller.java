package edu.kb.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kb.ex.command.BCommand;
import edu.kb.ex.command.BContentCommand;
import edu.kb.ex.command.BListCommand;

@Controller
public class Bcontroller {
	
	BCommand command = null;

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("리스트를 보여줍니다.");
		
		command = new BListCommand();
		command.execute(model);
		return "list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view()");
		model.addAttribute("request", request);
		
		command = new BContentCommand();
		command.execute(model);
		
		return "content_view";
	}
	
	
}
