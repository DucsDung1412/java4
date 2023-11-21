package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TinhTamGiac
 */
public class TinhTamGiac extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TinhTamGiac() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			double a = Double.valueOf(request.getParameter("a"));
			double b = Double.valueOf(request.getParameter("b"));
			double c = Double.valueOf(request.getParameter("c"));
			double chuVi = (a + b + c);
			if( (a + b > c) && (a + c > b) && (b + c > a) ) {
				if(request.getParameter("dienTich") != null) {
					double kq = Math.sqrt(chuVi * (a + b - c) * (a + c - b) * (b + c - a))/4;
					request.setAttribute("mess", "Diện tích của tam giác là " + kq);
				} else {
					request.setAttribute("mess", "Chu vi của tam giác là " + chuVi);
				}
			} else {
				request.setAttribute("mess", "Không thỏa mãn các cạnh của một tam giác!");
			}
		} catch (Exception e) {
			request.setAttribute("mess", "Không thỏa mãn các cạnh của một tam giác!");
		}
		request.getRequestDispatcher("/tamgiac.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
