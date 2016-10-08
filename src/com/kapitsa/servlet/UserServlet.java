package com.kapitsa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<h4>Username : " + request.getParameter("username") + "</h4>");
		pw.write("<h4>Level : " + request.getParameter("level") + "</h4>");
		pw.write("</body>");
		pw.write("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<h4>Login Success!</h4>");
		pw.write("<h4>Your Username : " + request.getParameter("username") + "</h4>");
		pw.write("<h4>Your password : " + request.getParameter("password") + "</h4>");
		pw.write("</body>");
		pw.write("</html>");
		
	}

}
