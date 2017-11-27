package com.appstek.EmployeeLogin;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appstek.ConnectionProvider.Validator;
public class LoginServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		Validator vld=new Validator();
		String str=vld.getValidation(uname, upwd);
		pw.println(str);
	}
}