package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.favorites;
import model.users;
import model.videos;
import util.hibernateUtil;

public class main {
	public static void main(String[] args) {
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					users u = new users(null, "a", "b", "c", true);
					videos v = new videos(null, "z", "x", "c", true, null);
					favorites f = new favorites(null, null, u, v);
					
					s.save(u);
					s.save(v);
					s.save(f);
					
					ts.commit();
				} finally {
					s.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
