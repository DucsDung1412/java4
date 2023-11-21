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
 * Servlet implementation class signup
 */
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
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
		if(request.getParameter("signin") != null) {
			response.sendRedirect("/lab5/bai4Signin.jsp");
		}
		
		HttpSession session = request.getSession();
		
		String id = String.valueOf(Calendar.getInstance().getTime());
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cfPassword = request.getParameter("confirmPassword");
		boolean role = false;
		users u = new users(id, password, fullname, email, role);
		
		if(password.equals(cfPassword)) {
			if(usersDAO.getUsersDAO().insertX(u)) {
				System.out.println("Thanh cong");
			} else {
				System.out.println("That bai");
			}
		} else {
			System.out.println("That bai");
		}
	}

}
