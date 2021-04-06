package cybersoft.java11.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java11.controller.AuthController;
import cybersoft.java11.properties.PageForm;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<h1>Login Page</h1>");
		writer.append("<br>");
		writer.append("<br>");
		writer.append(PageForm.loginForm);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if (AuthController.login(username, password)) {
			writer.append("Login sucessfull");
			writer.append("<br>");
			writer.append("<br>");
			writer.append("<a href='http://localhost:8080/Java11_Servlet/about'>Go to About page </a>");
		} else {
			writer.append("Login failed");
			writer.append("<br>");
			writer.append("<br>");
			writer.append("<a href='http://localhost:8080/Java11_Servlet/login'>Go to Login page </a>");
		}
	}

}
