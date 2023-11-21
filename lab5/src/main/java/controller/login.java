package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.user1DAO;
import model.users1;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubWed Nov 01 14:24:27 ICT 2023
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		request.setAttribute("test", "test");
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String fullname = request.getParameter("fullname");
			String email = request.getParameter("email");
			boolean role = request.getParameter("role").equals("Admin") ? true : false;
			String id = String.valueOf(Calendar.getInstance().getTime());
			if((users1)session.getAttribute("user") != null) {
				id = ((users1)session.getAttribute("user")).getId();
			}
			users1 u = new users1(id, username, password, fullname, email, role);
			
			if(request.getParameter("create") != null) {
				if((users1)session.getAttribute("user") == null) {						
					if(user1DAO.getUsers1DAO().insertX(u)) {
						session.setAttribute("mess", "them moi thanh cong");
					} else {
						session.setAttribute("mess", "them moi that bai");
					}
				} else {
					session.setAttribute("mess", "them moi that bai");
				}
			}
			
			if(request.getParameter("update") != null) {
				if((users1)session.getAttribute("user") != null) {					
					if(user1DAO.getUsers1DAO().updateX(u)) {
						session.setAttribute("user", u);
						session.setAttribute("mess", "cap nhat thanh cong");
					} else {
						session.setAttribute("mess", "cap nhat that bai");
					}
				} else {
					session.setAttribute("mess", "cap nhat that bai");
				}
			}
			
			if(request.getParameter("delete") != null) {
				if((users1)session.getAttribute("user") != null) {					
					if(user1DAO.getUsers1DAO().deleteX(u)) {
						session.removeAttribute("user");
						session.setAttribute("mess", "xoa thanh cong");
					} else {
						session.setAttribute("mess", "xoa that bai");
					}
				} else {
					session.setAttribute("mess", "xoa that bai");
				}
			}
			
			if(request.getParameter("reset") != null) {
				session.removeAttribute("user");
				session.removeAttribute("mess");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		ArrayList<users1> list = (ArrayList<users1>)user1DAO.getUsers1DAO().selectAll();
		for (users1 users1 : list) {
			if(request.getParameter(users1.getId()) != null) {
				session.setAttribute("user", users1);
				session.removeAttribute("mess");
				break;
			}
		}
		
		
		response.sendRedirect("/lab5/bai3.jsp");
	}

}
