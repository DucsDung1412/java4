package controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.usersDAO;
import model.users;

/**
 * Servlet implementation class signin
 */
public class signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(request.getParameter("signup") != null) {
			response.sendRedirect("/lab5/bai4Signup.jsp");
		}
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		users u = new users("", password, "", email, false);
		
		users uDAO = usersDAO.getUsersDAO().selectOne(u);
		if(uDAO != null) {
			session.setAttribute("user", uDAO);
			if(request.getParameter("remember") != null) {
				session.setAttribute("remember", true);
			}
			session.setAttribute("signin", true);
			response.sendRedirect(request.getContextPath() + "/bai4Profile.jsp");
			System.out.println("Thanh cong");
		} else {
			response.sendRedirect(request.getContextPath() + "/bai4Signin.jsp");
			System.out.println("That bai");
		}
	}

}
