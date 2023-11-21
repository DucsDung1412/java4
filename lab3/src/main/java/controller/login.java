package controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
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
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		String remember = request.getParameter("checked");
		
		if(!username.equalsIgnoreCase("poly")) {
			request.setAttribute("message", "Sai tên đăng nhập!");
			request.getRequestDispatcher("/cookie.jsp").forward(request, response);
		} else if(password.length() < 6) {
			request.setAttribute("message", "Sai mật khẩu!");
			request.getRequestDispatcher("/cookie.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "Đăng nhập thành công!");
			int hours = (remember == null) ? 2 : 60*60;
			this.add("username", username, hours, response);
			this.add("password", password, hours, response);
//			request.getRequestDispatcher("/lSuccess.jsp").forward(request, response);
			response.sendRedirect("/lab3/lSuccess.jsp");
		}
		
	}
	
	public static Cookie add(String name, String value, int hours, HttpServletResponse reponse) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(hours);
		cookie.setPath("/");
		reponse.addCookie(cookie);
		return cookie;
	}
	
	public static String get(String name, HttpServletRequest req) {
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie cookie: cookies) {
				if(cookie.getName().equalsIgnoreCase(name)) {
					return cookie.getValue();
				}
			}
		}
		return "";
	}
}
