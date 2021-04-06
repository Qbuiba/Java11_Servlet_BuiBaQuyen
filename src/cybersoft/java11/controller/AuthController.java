package cybersoft.java11.controller;

import java.util.LinkedList;
import java.util.List;

import cybersoft.java11.model.User;

public class AuthController {
	public static List<User> userList = new LinkedList<User>();

	public AuthController() {
		userList.add(new User("admin", 20, "admin", "admin"));
		userList.add(new User("toan", 30, "toan", "toan"));
	}

	// Authentication login checking
	public static boolean login(String username, String password) {
		boolean result = false;
		for (User user : userList) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return user.getPassword().equals(password);
			}
		}
		return result;
	}

	// Authentication existed user checking
	public static boolean isExistedUser(String username) {
		boolean result = false;

		for (User user : userList) {
			if (user.getUsername().equals(username)) {
				result = true;
				break;
			}
		}
		return result;
	}

}
