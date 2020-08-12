package kr.ac.syu.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.sf.json.JSONObject;

@Controller
public class ChatAPIController {
	
	@Autowired
	private JSONObject jsonObj;
	
	@RequestMapping(value="/ChatAPIController.chat", method=RequestMethod.POST)
	private void CommunicateMessage(@RequestBody String msg,
						 HttpServletResponse response) {
		System.out.println(msg);

//		String queryResult = "";
//		String url = "http://127.0.0.1:5110/syu/v1/";
		
//		jsonObj.put("message", getRequestToPyhtonServer(url, msg));
		jsonObj.put("message", msg);
		jsonResponseToClient(response, jsonObj);
	}
	
	@SuppressWarnings("unused")
	private String getRequestToPyhtonServer(String gURL, String message) {
		String result = "";
		
		try {
			message = URLEncoder.encode(message, "UTF-8");
			
			URL url = new URL(gURL + message);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			
			http.setRequestMethod("GET");
			http.setDoInput(true);
			http.setDoOutput(false);
			
			InputStreamReader isr
				= new InputStreamReader(http.getInputStream(), "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String str = "";
			while((str = br.readLine()) != null) {
				sb.append(str + "\n");
			}
			result = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
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
