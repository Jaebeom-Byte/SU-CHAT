package kr.ac.syu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
	@RequestMapping("/recvMsg.chat")
	public String showBot() {
		return "/WEB-INF/views/chatbot.jsp";
	}
}
