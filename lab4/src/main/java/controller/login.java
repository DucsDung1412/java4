package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    
    
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	System.out.println(1);
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String checked = request.getParameter("checked") != null ? "YES" : "NO";
		
		HttpSession session = request.getSession();
		ArrayList<ArrayList<String>> list = (ArrayList<ArrayList<String>>) session.getAttribute("listAcc");
		if(list != null) {
			ArrayList<String> ls1 = new ArrayList<>();
			ls1.add(username);
			ls1.add(password);
			ls1.add(checked);
			list.add(ls1);
			session.setAttribute("listAcc", list);
		} else {
			list = new ArrayList<ArrayList<String>>();
			ArrayList<String> ls1 = new ArrayList<>();
			ls1.add(username);
			ls1.add(password);
			ls1.add(checked);
			list.add(ls1);
			session.setAttribute("listAcc", list);
		}
		
//		request.getRequestDispatcher("/bai2.jsp").forward(request, response);
		response.sendRedirect("/lab4/bai2.jsp");
	}

}
