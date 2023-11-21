package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class AppListener extends HttpServlet implements HttpSessionListener, ServletContextListener {
	private static final long serialVersionUID = 1L;
	 private int count;
	 private Path path = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\New folder\\count.txt");
	    
	public AppListener() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/bai1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		try {
			Files.write(path, String.valueOf(count).getBytes(), StandardOpenOption.WRITE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sce.getServletContext().removeAttribute("count");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try {
			count = Integer.parseInt(Files.readAllLines(path).get(0));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sce.getServletContext().setAttribute("count", count);
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		count++;
		se.getSession().getServletContext().setAttribute("count", count);
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {

	}
}
