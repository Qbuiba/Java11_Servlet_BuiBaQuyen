package cybersoft.java11.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java11.controller.AuthController;
import cybersoft.java11.model.User;
import cybersoft.java11.properties.PageForm;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	/*
	 * url: /register
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.append("<h1>Sign Up Page</h1>");
		writer.append("<br>");
		writer.append(PageForm.signUpForm);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		// Get parameter from Sign Up form
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// Authentication processing
		if (AuthController.isExistedUser(username)) {
			writer.append("This username is existed! Please select other username !!!");
			writer.append("<br>");
			writer.append("<br>");
			writer.append("<br>");
			writer.append("<a href='http://localhost:8080/Java11_Servlet/signup'>Go back to Sign Up page </a>");
		} else {
			AuthController.userList.add(new User(name, age, username, password));
			writer.append("New user has been created:");
			writer.append("<br>");
			writer.append("<br>");
			writer.append(username);
			writer.append("<br>");
			writer.append("<br>");
			writer.append("<a href='http://localhost:8080/Java11_Servlet/login'>Go to Login page </a>");
		}

	}

}
