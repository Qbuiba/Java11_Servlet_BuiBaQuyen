package cybersoft.java11.controller;

import java.util.List;

import cybersoft.java11.model.User;

public class AuthController {
	private static List<User> userList;

	public AuthController() {

		userList.add(new User("admin", "admin"));
		userList.add(new User("toan", "toan"));
	}

	public static boolean login(String username, String password) {
		boolean result = false;
		for (User user : userList) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return user.getPassword().equals(password);
			}
		}
		return result;
	}

	public static boolean register(String username, String password) {
		boolean result = false;

		// REGISTER A USER

		return result;
	}

}
