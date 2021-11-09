package Log;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/Loginpage")
public class Loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();
              String uname = request.getParameter("username");
              String pwd = request.getParameter("pwd");
              out.println(uname);
              User u1 = new User();
              u1.setName(uname);
              u1.setPwd(pwd);
              
              if(uname.equals("rohit"))
              {
            	  HttpSession session = request.getSession(true);
            	  session.setAttribute("user", u1);
            	  RequestDispatcher rd = request.getRequestDispatcher("Welcome");
            	  rd.forward(request, response);
              }
              else
              {
            	  response.sendRedirect("error.html");
              }
              
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
