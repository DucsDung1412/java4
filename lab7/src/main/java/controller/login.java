package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if(request.getParameter("login") != null) {
			session.setAttribute("logout", false);
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			Boolean remember = request.getParameter("remember") != null ? true : false;
			Boolean role = true;
			
			if(email.equals("daoducdung2000@gmail.com") && password.equals("DungVipPro")) {
				session.setAttribute("email", email);
				session.setAttribute("password", password);
				session.setAttribute("role", role);
				session.setAttribute("remember", remember);
				session.setAttribute("logout", false);
				response.sendRedirect(request.getContextPath() + "/bai3_2.jsp");
			} else {
				session.removeAttribute("email");
				session.removeAttribute("password");
				session.removeAttribute("role");
				response.sendRedirect(request.getContextPath() + "/bai3_1.jsp");
			}
		}
		
		if(request.getParameter("logout") != null) {
			session.setAttribute("logout", true);
			if(!(Boolean)session.getAttribute("remember")) {
				session.removeAttribute("email");
				session.removeAttribute("password");
			}
			session.removeAttribute("role");
			response.sendRedirect(request.getContextPath() + "/bai3_1.jsp");
		}
		
//		response.sendRedirect(request.getContextPath() + "/bai2.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
