package com.tus.Dispatcher;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName= request.getParameter("user_nm"); 
		String userPwd= request.getParameter("user_pwd"); 
		
		if(userName.equalsIgnoreCase("tushar")&& userPwd.equalsIgnoreCase("123")){
			RequestDispatcher requestDispatchr= request.getRequestDispatcher("/orderPizza.html");
			requestDispatchr.forward(request, response);
		}
		else{
			out.print("UserName or Password is Wrong!");
			RequestDispatcher requestDispatchr= request.getRequestDispatcher("/index.html");
			requestDispatchr.include(request, response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
