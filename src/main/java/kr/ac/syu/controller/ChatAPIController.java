package kr.ac.syu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.syu.core.ResponseProcess;
import net.sf.json.JSONObject;

@Controller
public class ChatAPIController {
	
	@Autowired
	private JSONObject jsonObj;
	private ResponseProcess processedResponse = new ResponseProcess();
	
	@RequestMapping(value="/ChatAPIController.chat", method=RequestMethod.POST)
	private void communicateMessage(@RequestBody String msg,
						 			HttpServletResponse response) {
		jsonObj.put("message", processedResponse.getMessage(msg));
		jsonResponseToClient(response, jsonObj);
	}

	private void jsonResponseToClient(HttpServletResponse response, JSONObject jsonObj) {
		PrintWriter out = null;
		try {
			out = response.getWriter();
			
			out.print(jsonObj);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null)
				out.close();
		}
	}
}
