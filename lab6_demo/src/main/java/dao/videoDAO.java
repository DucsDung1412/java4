package dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.video;
import util.hibernateUtil;

public class videoDAO implements daoInterface<video> {
	public static videoDAO getVideoDAO() {
		return new videoDAO();
	}
	
	@Override
	public boolean insertX(video g) {
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
	public boolean deleteX(video g) {
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
	public boolean updateX(video g) {
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
	public video selectX(video g) {
		video u = new video();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					u = s.get(video.class, g.getId());
					
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
	public List<video> selectAll() {
		List<video> list = new ArrayList<>();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "FROM video v";
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
	
	public List<Object> selectToKey(String key) {
		List<Object> list = new ArrayList<>();
		
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			
			if(sf != null) {
				Session s = sf.openSession();
				
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "SELECT DISTINCT f"
							+ 	 " FROM favorites f"
							+ 	 " WHERE f.video.title LIKE :key"
							+ 	 " GROUP BY f.video.videoId"
							+ 	 " ORDER BY COUNT(f.favoritesId) DESC";
					Query query = s.createQuery(hql);
					query.setParameter("key", "%" + key + "%");
					list = query.getResultList();
					
					
					ts.commit();
				} finally {
					s.close();
				}
				
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public video selectAllX(video g) {
		video u = new video();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					u = s.get(video.class, g.getId());
					u.getListF().size();
					
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
	
	public List<video> selectAllVideoToFavorites(String favorite) {
		List<video> list = new ArrayList<>();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "SELECT DISTINCT v"
							+ 	 " FROM video v left JOIN favorites f"
							+ 	 " ON v = f.video"
							+ 	 " WHERE f.favoritesId IS " + favorite;
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
	
	public List<video> selectAllVideoToDate(Date minDate, Date maxDate) {
		List<video> list = new ArrayList<>();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "SELECT DISTINCT v,"
							+ 	 " f.likeDate"
							+ 	 " FROM video v JOIN favorites f"
							+ 	 " ON v = f.video"
							+ 	 " WHERE f.likeDate BETWEEN :minDate AND :maxDate";
					Query query = s.createQuery(hql);
					query.setParameter("minDate", minDate);
					query.setParameter("maxDate", maxDate);
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
	
	public List<video> selectAllVideoToMonth(ArrayList<Integer> months) {
		List<video> list = new ArrayList<>();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "SELECT DISTINCT v,"
							+ 	 " f.likeDate"
							+ 	 " FROM video v JOIN favorites f"
							+ 	 " ON v = f.video"
							+ 	 " WHERE MONTH(f.likeDate) IN (:month)";
					Query query = s.createQuery(hql);
					query.setParameter("month", months);
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
	
	public List<video> selectVideoToRand() {
		List<video> list = new ArrayList<>();
		try {
			SessionFactory sf = hibernateUtil.getSessionFactory();
			if(sf != null) {
				Session s = sf.openSession();
				try {
					Transaction ts = s.beginTransaction();
					
					String hql = "SELECT v FROM video v ORDER BY rand()";
					Query query = s.createQuery(hql);
					query.setMaxResults(2);
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
