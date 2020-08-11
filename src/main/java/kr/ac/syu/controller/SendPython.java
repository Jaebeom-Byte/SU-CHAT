package kr.ac.syu.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

@WebServlet("/ChatAPIController")
public class SendPython extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3874294444082292472L;
	
	private JSONObject jsonObj;
	
	@Override
	protected void service(HttpServletRequest request
						 , HttpServletResponse response
						 ) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		String msg = "";
		if ("POST".equalsIgnoreCase(request.getMethod())) {
			msg = request.getReader()
						 .lines().collect(
								 	Collectors.joining(
								 			System.lineSeparator()
								 	)
								 );
		}
		
		String queryResult = "";
		String url = "http://127.0.0.1:5110/syu/v1/";
		
		queryResult = getRequestToPython(url, msg);
		
		jsonObj = JSONObject.fromObject(queryResult);
		jsonResponseToClient(response, jsonObj);
	}
	
	private String getRequestToPython(String gURL, String message) {
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
	
	private void jsonResponseToClient(HttpServletResponse response
									, JSONObject jsonObj) {
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.print(jsonObj);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out != null) out.close();
		}
	}
}













