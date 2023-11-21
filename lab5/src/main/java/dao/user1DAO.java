package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.users;
import model.users1;
import util.hibernateUtil;

public class user1DAO implements daoInterface<users1>{
	public static user1DAO getUsers1DAO() {
		return new user1DAO();
	}

	@Override
	public boolean insertX(users1 g) {
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			
			if(sf != null) {
				Session s = sf.openSession();
				
				try {
					Transaction ts = s.beginTransaction();
					
					s.save(g);
					
					ts.commit();
				
				} finally {
					s.close();
				}
				
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteX(users1 g) {
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			
			if(sf != null) {
				Session s = sf.openSession();
				
				try {
					Transaction ts = s.beginTransaction();
					
					s.delete(g);
					
					ts.commit();
				
				} finally {
					s.close();
				}
				
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateX(users1 g) {
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			
			if(sf != null) {
				Session s = sf.openSession();
				
				try {
					Transaction ts = s.beginTransaction();
					
					s.update(g);
					
					ts.commit();
				
				} finally {
					s.close();
				}
				
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public users1 selectX(users1 g) {
		users1 u = new users1();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					u = s.get(users1.class, g.getId());
					
					ts.commit();
				} finally {
					s.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public List<users1> selectAll() {
		List<users1> list = new ArrayList<>();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "FROM users1 u";
					Query query = s.createQuery(hql);
					list = query.getResultList();
					
					ts.commit();
				} finally {
					s.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
}
