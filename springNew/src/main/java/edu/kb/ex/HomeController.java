package edu.kb.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.kb.ex.member.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/index")
	public String goIndex() {
		return "index";
	}
	@RequestMapping(method=RequestMethod.GET, value="/student")
	public String gogoIndex(HttpServletRequest req, Model model ) {
		String id = req.getParameter("id");
		model.addAttribute("id", id);
		return "index";
	}
	
	
	
	@RequestMapping("/member/join")
	public String joinData(Member member) {
		return "member/join";
	}
	
	@RequestMapping("/board/content")
	public String content(Model model) {
		model.addAttribute("id", 30);
		return "board/content";
	}
	
	@RequestMapping("/board/reply")
	public ModelAndView reply () {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 30);
		mv.setViewName("board/reply");
		return mv;
	}
	
	@RequestMapping("/circle/3")
	public String value(Model model) {
		model.addAttribute("area", 3*3*Math.PI);
		return "circle/3";
	}

	@RequestMapping("/total/90/80/75")
	public String total(Model model) {
		model.addAttribute("hab", 90+80+75);
		model.addAttribute("avg", (90+80+75)/3);
		 
		return "total/avg";
	}
	@RequestMapping("/student/{studentId}")
	public String student(@PathVariable String studentId, Model model) {
		model.addAttribute("studentId", studentId);
		return "student/studentview";
	}
	
	@RequestMapping("/board/confirmId")
	public String confirmId(HttpServletRequest req, Model model) {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
	 	return "board/confirmId";
	}
	@RequestMapping("/board/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/checkId";
	}
	/*
	@RequestMapping("/score/{kor}/{eng}/{math}")
	public String score(@PathVariable int kor, @PathVariable int eng, @PathVariable int math, Model model) {
		int hab = kor+eng+math;
		int avg = hab/3;
		model.addAttribute("hab", hab);
		model.addAttribute("avg", avg);
		
		return "score/hab";
	}
	*/
	@RequestMapping("/score")
	public String StudentSc() {
		return "score/StudentSc";
	}
	@RequestMapping("/scoreChk")
	public String StudentScRs(@RequestParam("kor") int kor, @RequestParam("eng") int eng, @RequestParam("math") int math, Model model) {
		int total = kor + eng + math;
		int avg = total/3;
		model.addAttribute("total", total);
		model.addAttribute("avg", avg);
		
		return "score/StudentScRS";
	}
	

}
	
	
	
	
	
