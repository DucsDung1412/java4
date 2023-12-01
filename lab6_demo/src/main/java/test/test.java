package test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dao.favoritesDAO;
import dao.userDAO;
import dao.videoDAO;
import model.favorites;
import model.user;
import model.video;

public class test {
	public static void main(String[] args) {
		// lab6-2.1
//		user u = new user();
//		u.setId("US Mon Nov 06 13:33:29 ICT 2023");
//		user uDAO = userDAO.getUserDAO().selectX(u);
//		if(uDAO != null) {
//			user us = userDAO.getUserDAO().selectAllX(uDAO);
//			for (favorites f : us.getListF()) {
//				System.out.println(f.getVideo().getTitle());
//			}
//		}
		
		// lab6-2.2
//		List<Object> list = videoDAO.getVideoDAO().selectToKey("");
//		for(video v : videoDAO.getVideoDAO().selectAll()) {
//			for (Object object : list) {
//				if(((favorites)object).getVideo().getId().equals(v.getId())) {
//					System.out.println(v.getId());
//					System.out.println(v.getTitle());
//					System.out.println(v.getView());
//					System.out.println(v.getActive());
//				}
//			}
//			System.out.println("-------------");
//		}
		
		// lab6-2.3
//		video v = new video();
//		v.setId("2");
//		List<user> list = userDAO.getUserDAO().selectUserLikeVideo(v);
//		for (user user : list) {
//			System.out.println(user.getEmail());
//		}
		
		// lab6-2.4
//		List<video> list = videoDAO.getVideoDAO().selectAllVideoToFavorites("NULL");
//		System.out.println(list.get(0).getId());
		
		// lab6-2.5
//		List<Object[]> list = favoritesDAO.getFavoritesDAO().selectTo();
//		for (Object[] object : list) {
//			System.out.println(object[0]);
//			System.out.println(object[1]);
//			System.out.println(object[2]);
//			System.out.println(object[3]);
//			System.out.println("--------------");
//		}
		
		// lab6-3.3
//		Date minDate = new Date(2023-1900, 11-1, 5);
//		Date maxDate = new Date(2023-1900, 11-1, 8);
//		List<video> list = videoDAO.getVideoDAO().selectAllVideoToDate(minDate, maxDate);
//		System.out.println(list.size());
		
		// lab6-3.4
//		ArrayList<Integer> test = new ArrayList<>();
//		test.add(11);
//		test.add(12);
//		List<video> list = videoDAO.getVideoDAO().selectAllVideoToMonth(test);
//		System.out.println(list.size());
		
		// lab6-4.1
//		List<video> list = videoDAO.getVideoDAO().selectVideoToRand();
//		System.out.println(list.size());
		
		// lab6-4.2
//		List<Object[]> list = favoritesDAO.getFavoritesDAO().selectToYear(2020);
//		for (Object[] object : list) {
//			System.out.println(object[0]);
//			System.out.println(object[1]);
//			System.out.println(object[2]);
//			System.out.println(object[3]);
//			System.out.println("--------------");
//		}
	}
}
