package controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sendMailServlet
 */
public class sendMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sendMailServlet() {
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
		String error = "";
		try {
			final String tk = "nguyenhoahung1007@gmail.com";
			final String password = "miyadhnqogmurwqu";
			
			Properties p = new Properties();
			p.put("mail.smtp.auth", "true");
			p.put("mail.smtp.starttls.enable", "true");
			p.put("mail.smtp.host", "smtp.gmail.com");
			p.put("mail.smtp.port", "587"); 
			p.put("mail.smtp.ssl.protocols", "TLSv1.2");

			Authenticator au = new Authenticator() {
				@Override
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new javax.mail.PasswordAuthentication(tk, password);
				}
			};
			System.out.println(request.getParameter("fromEmail"));
			Session s = Session.getInstance(p, au);
			Message msg = new MimeMessage(s);
			msg.setFrom(new InternetAddress(tk));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(request.getParameter("toEmail")));
            msg.setSubject(request.getParameter("subject"));
            msg.setText(request.getParameter("body"));
            
            Transport.send(msg);
            
            error = "Send Mail Success";
		} catch (Exception e) {
			error = "Send Mail Success";
			e.printStackTrace();
		}
		request.getSession().setAttribute("error", error);
		request.getSession().setAttribute("error1", error);
//		request.getSession().removeAttribute("error");
		
		response.sendRedirect("/lab3/sendMailLog.jsp"); 
	}

}
