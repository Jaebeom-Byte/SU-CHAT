package kr.ac.syu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChatAPIController {
	@RequestMapping(value="/ChatAPIController.chat", method=RequestMethod.POST)
	public void messages(@RequestBody String msg,
						 HttpServletResponse response) {
		System.out.println(msg);
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.print(msg);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(out != null) out.close();
		}
	}
}
