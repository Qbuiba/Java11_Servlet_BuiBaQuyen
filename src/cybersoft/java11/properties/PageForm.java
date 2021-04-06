package cybersoft.java11.properties;

public class PageForm {
	public static String loginForm = "<form method=\"POST\" action=\"\">\r\n"
			+ "		<label for=\"userId\">Username:</label>\r\n"
			+ "		<input type=\"text\" name=\"username\" id=\"userId\">\r\n" + "		<br>\r\n" + "		<br>\r\n"
			+ "		<label for=\"userPassword\">Password:</label>\r\n"
			+ "		<input type=\"password\" name=\"password\" id=\"userPassword\">\r\n" + "		<br>\r\n"
			+ "		<br>\r\n" + "		<input type=\"submit\" value=\"Login\">\r\n" + "		<br>\r\n"
			+ "	</form>\r\n" + "	<br>\r\n"
			+ "	<a href=\"http://localhost:8080/Java11_Servlet/signup\">Go to Sign Up page </a>";

	public static String signUpForm = "<form method=\"POST\" action=\"\">\r\n"
			+ "		<h1>Plesase input your information below: </h1>\r\n" + "		<br>\r\n"
			+ "		<label for=\"nameId\">Name:</label>\r\n"
			+ "		<input type=\"text\" name=\"name\" id=\"nameId\" required>\r\n" + "		<br>\r\n"
			+ "		<br>\r\n" + "		<label for=\"ageId\">Age:</label>\r\n"
			+ "		<input type=\"text\" name=\"age\" id=\"ageId\" required>\r\n" + "		<br>\r\n"
			+ "		<br>\r\n" + "		<label for=\"userId\">Username:</label>\r\n"
			+ "		<input type=\"text\" name=\"username\" id=\"userId\" required>\r\n" + "		<br>\r\n"
			+ "		<br>\r\n" + "		<label for=\"userPassword\">Password:</label>\r\n"
			+ "		<input type=\"password\" name=\"password\" id=\"userPassword\" required>\r\n" + "		<br>\r\n"
			+ "		<br>\r\n" + "		<input type=\"submit\" value=\"Sign up\">\r\n" + "	</form>\r\n"
			+ "	<br>\r\n" + "	<a href=\"http://localhost:8080/Java11_Servlet/login\">Go to Login page </a>";

}
