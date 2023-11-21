package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.users;
import util.hibernateUtil;

public class usersDAO implements daoInterface<users> {
	public static usersDAO getUsersDAO() {
		return new usersDAO();
	}
	
	@Override
	public boolean insertX(users g) {
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
	public boolean deleteX(users g) {
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
	public boolean updateX(users g) {
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
	public users selectX(users g) {
		users u = new users();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					u = s.get(users.class, g.getId());
					
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
	public List<users> selectAll() {
		List<users> list = new ArrayList<>();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "FROM users u";
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
	
	public List<users> selectByRole(boolean role){
		List<users> list = new ArrayList<>();
		
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "FROM users u WHERE u.admin = :role";
					Query query = s.createQuery(hql);
					query.setParameter("role", role);
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
	
	public users selectOne(users g){
		users user = new users();
		List<users> list = new ArrayList<>();
		
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "FROM users u WHERE u.email = :email AND u.password = :password";
					Query query = s.createQuery(hql);
					query.setParameter("email", g.getEmail());
					query.setParameter("password", g.getPassword());
					list = query.getResultList();
					if(!list.isEmpty()) {
						user = list.get(0);
					} else {
						user = null;
					}
					
					ts.commit();
				} finally {
					s.close();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	public List<users> selectKeyWord(String str){
		List<users> list = new ArrayList<>();
		
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "FROM users u WHERE u.fullname like :fullname";
					Query query = s.createQuery(hql);
					query.setParameter("fullname", "%" + str + "%");
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
