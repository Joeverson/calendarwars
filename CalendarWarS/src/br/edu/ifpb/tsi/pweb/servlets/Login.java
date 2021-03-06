package br.edu.ifpb.tsi.pweb.servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import br.edu.ifpb.tsi.pweb.dao.PersistenceUtil;
import br.edu.ifpb.tsi.pweb.dao.UserDAO;


/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		try{		
			EntityManager em = PersistenceUtil.getCurrentEntityManager();
			UserDAO userdao = new UserDAO(em);			
			User user = (User) userdao.auth(request.getParameter("login"), request.getParameter("pass"));
				
			System.out.println(user.getName());
			
			if(user != null){
				session.setAttribute("user", user);
				session.setMaxInactiveInterval(20*100);
				
				RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
				rd.forward(request, response);
			}else{
				request.setAttribute("error", "Usuario ou senha incorretas");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		}catch(Exception e){			
			request.setAttribute("error", "Banco de dados vazio ou fora do ar");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}			
	}

}
