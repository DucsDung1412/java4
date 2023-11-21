package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dangKyServlet
 */
public class dangKyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangKyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("flexRadioDefault");
		String mary = request.getParameter("mary");
		String live = request.getParameter("live");
		String note = request.getParameter("note");
		ArrayList<String> likes = new ArrayList<String>(Arrays.asList(request.getParameterValues("like")));
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		request.setAttribute("flexRadioDefault", gender);
		request.setAttribute("mary", mary);
		request.setAttribute("live", live);
		request.setAttribute("note", note);
		request.setAttribute("likes", likes);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("gender: " + gender);
		System.out.println("mary: " + request.getParameter("mary"));
		System.out.println("soThich: " + likes);
		System.out.println("live: " + live);
		System.out.println("note: " + note);
		
		request.getRequestDispatcher("/loginSuccess.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
