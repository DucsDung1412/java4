package controller;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

import model.thongTinNV;

/**
 * Servlet implementation class dkServlet
 */
@MultipartConfig()
public class dkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String date = request.getParameter("date");
		String gender = request.getParameter("gender");
		String mary = request.getParameter("mary");
		String live = request.getParameter("live");
		String note = request.getParameter("note");
		ArrayList<String> likes = new ArrayList<String>(Arrays.asList(request.getParameterValues("like")));
		request.setAttribute("username", username);
		request.setAttribute("date", date);
		request.setAttribute("flexRadioDefault", gender);
		request.setAttribute("mary", mary);
		request.setAttribute("live", live);
		request.setAttribute("note", note);
		request.setAttribute("likes", likes);
		System.out.println("username: " + username);
		System.out.println("date: " + date);
		System.out.println("gender: " + gender);
		System.out.println("mary: " + request.getParameter("mary"));
		System.out.println("soThich: " + likes);
		System.out.println("live: " + live);
		System.out.println("note: " + note);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date datee;
		try {
			datee = formatter.parse(date);
			System.out.println((datee)); 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/loginSuccess.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DateTimeConverter dtc = new DateConverter(new Date());
			dtc.setPattern("MM/dd/yyyy");
			ConvertUtils.register(dtc, Date.class);
			
			File dir = new File(request.getServletContext().getRealPath("/files"));
			if(!dir.exists()) { 
				dir.mkdirs();
			}
			
			thongTinNV thongTinNV = new thongTinNV();
			BeanUtils.populate(thongTinNV, request.getParameterMap());
			thongTinNV.setGender(request.getParameter("gender").equals("Nam") ? true : false);
			thongTinNV.setMary(request.getParameter("mary") == null ? false : true);
			
			Part part = request.getPart("image");
			File fileImg = new File(dir, part.getSubmittedFileName());
			part.write(fileImg.getAbsolutePath());
			thongTinNV.setImage(part.getSubmittedFileName());
			
			request.setAttribute("thongTinNV", thongTinNV);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/loginSuccess.jsp").forward(request, response);
	}

}
