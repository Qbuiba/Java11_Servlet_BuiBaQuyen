package cybersoft.java11.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO return about page
		PrintWriter writer = resp.getWriter();
		writer.write("<h1 style='color:blue; text-align:center;'> This is About Page </h1>");
		writer.write(
				"<a href='http://localhost:8080/Java11_Servlet/' style='color:red; text-align:center;'>Go to Home page</a>");
	}

}
