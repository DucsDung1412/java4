package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCounterServlet
 */
public class HitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count;
    private Path path = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\New folder\\count.txt");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			count = Integer.parseInt(Files.readAllLines(path).get(0));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			Files.write(path, String.valueOf(count).getBytes(), StandardOpenOption.WRITE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;
		request.setAttribute("count", count);
		request.getRequestDispatcher("/hit-counter.jsp").forward(request, response);
	}

}
