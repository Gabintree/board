package edu.kb.ex.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import edu.kb.ex.dao.BDao;
import edu.kb.ex.dto.BDto;

public class BReplyViewCommand implements BCommand{

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bid = request.getParameter("bid");
		
		BDao dao = new BDao();
		BDto dto = dao.reply_view(bid);
		
		model.addAttribute("reply_view", dto);
	}
	

}
