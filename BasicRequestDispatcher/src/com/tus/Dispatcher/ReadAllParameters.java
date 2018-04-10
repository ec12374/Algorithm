package com.tus.Dispatcher;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadAllParameters
 */
@WebServlet("/ReadAllParameters")
public class ReadAllParameters extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReadAllParameters() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		Enumeration<String> paramNames = request.getParameterNames();

		out.print("Hi...");
		while (paramNames.hasMoreElements()) {

			String paramName = paramNames.nextElement();
			out.print(" " + paramName + ": ");
			String[] paramValues = request.getParameterValues(paramName);
			// Read single valued data
			if (paramValues.length == 1) {
				out.print(paramValues[0] + "<br />");
			} else {
				out.print("<br />");
				for (int i = 0; i < paramValues.length; ++i) {
					out.println("* " + paramValues[i]+"<br />");
				}
				out.print("<br />");

			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
