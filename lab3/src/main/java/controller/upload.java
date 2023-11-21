package controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class upload
 */
@MultipartConfig()
@WebServlet("/upload")
public class upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		File dir = new File(request.getServletContext().getRealPath("/files"));
		if(!dir.exists()) { 
			dir.mkdirs();
		}
		
		Part photo = request.getPart("photo_file"); 
		File photoFile = new File(dir, photo.getSubmittedFileName());
		photo.write(photoFile.getAbsolutePath());
		
		Part doc = request.getPart("doc_file");
		File docFile = new File(dir, doc.getSubmittedFileName());
		doc.write(docFile.getAbsolutePath());
		
		System.out.println(dir);
		
		request.setAttribute("img", request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/files/" + photo.getSubmittedFileName());
		request.setAttribute("doc", request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/files/" + doc.getSubmittedFileName());
		
		request.getRequestDispatcher("/resultUpLoad.jsp").forward(request, response);
	}

}
