package cybersoft.java11.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java11.controller.AuthController;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String formHtml = "<form method=\"POST\" action=\"\">\r\n" + "		<label for=\"userId\">Username:</label>\r\n"
				+ "		<input type=\"text\" name=\"username\" id=\"userId\">\r\n" + "		<br>\r\n"
				+ "		<label for=\"userPassword\">Password:</label>\r\n"
				+ "		<input type=\"password\" name=\"password\" id=\"userPassword\">\r\n" + "		<br>\r\n"
				+ "		<input type=\"submit\" value=\"Login\">\r\n" + "	</form>";
		writer.append("Login page <br>");
		writer.append(formHtml);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if (AuthController.login(username, password)) {
			writer.write("Login sucessfull");
		} else {
			writer.write("Login failed");
		}
	}

}
