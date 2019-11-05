package com.alidojo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response .setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		// in URL http://localhost:8080/HelloWorld/Home?name=CodingDojo4&language=java&city=Abha
		
		String userName = request.getParameter("name")  ; 
		
		String LanguageNAme= request.getParameter("language"); 
		
		String city = request.getParameter("city"); 
		
		if (city == "null")
		{
			city ="Unknown";
		}
		
		out.write("<h1>Welcome, " + userName + "</h1>");
		 out.write("<h2>Yuor favorite language is:  " + LanguageNAme + "</h2>");
		 out.write("<h3>Your hometown is:  " + city + "</h3>");
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
