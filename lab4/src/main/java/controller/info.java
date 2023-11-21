package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.project;

/**
 * Servlet implementation class info
 */
public class info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public info() {
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
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		ArrayList<project> list = new ArrayList<>();
		try {
			date = sdf.parse("30/10/2020");
			project p1 = new project("Nokia 1", "img/header-object.png", 100.00, 50.0, date);
			project p2 = new project("Nokia 2", "img/header-object.png", 200.00, 150.0, date);
			project p3 = new project("Nokia 3", "img/header-object.png", 300.00, 5.0, date);
			project p4 = new project("Nokia 4", "img/header-object.png", 400.00, 10.0, date);
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = "";
		if(session.getAttribute("project") != null) {
			session.removeAttribute("project");
		}
		for (project p : list) {
			if(request.getParameter(p.getName()) != null) {
				session.setAttribute("project", p);
				response.sendRedirect("/lab4/resultBai4.jsp");
				break;
			}
		}
		
	}

}
