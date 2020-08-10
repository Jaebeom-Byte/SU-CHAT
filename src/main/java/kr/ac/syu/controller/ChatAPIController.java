package kr.ac.syu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChatAPIController {
	@ResponseBody
	@RequestMapping(value="/ChatAPIController.chat", method=RequestMethod.POST)
	public String message(@RequestBody String message) {
		System.out.println(message);
		return message;
	}
}
