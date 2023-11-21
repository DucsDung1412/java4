package main;

import java.util.List;

import dao.usersDAO;
import model.users;

public class main {
	public static void main(String[] args) {
		users u = new users("3", "789", "HungNCC", "Hung@gmail.com", false);
		u.setEmail("Dung@gmail.com");
		u.setPassword("123");
//		usersDAO.getUsersDAO().insertX(u);
		System.out.println(usersDAO.getUsersDAO().selectKeyWord("").size()); 
//		List<users> list = usersDAO.getUsersDAO().selectByRole(true);
//		for (users users : list) {
//			System.out.println(users.getFullname());
//		}
		
	}
}
