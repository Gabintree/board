package edu.kb.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kb.ex.command.BCommand;
import edu.kb.ex.command.BContentCommand;
import edu.kb.ex.command.BDeleteCommand;
import edu.kb.ex.command.BListCommand;
import edu.kb.ex.command.BReplyCommand;
import edu.kb.ex.command.BReplyViewCommand;
import edu.kb.ex.command.BWriteCommand;

@Controller
public class Bcontroller {
	
	BCommand command = null;
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("reply_view()");
		
		model.addAttribute("request", request);
		command = new BReplyViewCommand();
		command.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply()");
		
		model.addAttribute("request", request);
		command = new BReplyCommand();
		command.execute(model);
		
		return "redirect:list";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("리스트를 보여줍니다.");
		
		command = new BListCommand();
		command.execute(model);
		return "list";
	}

	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view  입니다.");
		
		 return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write() 보여줍니다.");
		
		model.addAttribute("request", request);
		
		command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete() 보여줍니다.");
		
		model.addAttribute("request", request);
		
		command = new BDeleteCommand();
		command.execute(model);
		
		return "redirect:list";
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
