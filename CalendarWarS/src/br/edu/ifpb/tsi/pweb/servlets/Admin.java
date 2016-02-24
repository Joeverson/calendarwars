package br.edu.ifpb.tsi.pweb.servlets;



import java.io.IOException;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifpb.tsi.pweb.dao.CalendarNotesDAO;
import br.edu.ifpb.tsi.pweb.dao.PersistenceUtil;
import br.edu.ifpb.tsi.pweb.model.Note;
import br.edu.ifpb.tsi.pweb.model.User;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher r;
		
		if(session.getAttribute("user") == null)
			r = request.getRequestDispatcher("login.jsp");
		else
			r = request.getRequestDispatcher("admin.jsp");
		
		r.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date = request.getParameter("date");	
		String[] dateArray = date.split("-");
		
		//preparando o objedo calendar com a data recebida.
		Calendar c = Calendar.getInstance();
		c.set(Integer.valueOf(dateArray[0]), Integer.valueOf(dateArray[1]), Integer.valueOf(dateArray[2]));
				
		String note = request.getParameter("note");
						
		HttpSession session = request.getSession();
		
		if(((User) session.getAttribute("user")) == null){			
			request.setAttribute("error", "ERRO: ao gravar a nota");			
		}else{
			Note notas = new Note(c, note, ((User) session.getAttribute("user")));
			
			//EntityManager em = PersistenceUtil.getCurrentEntityManager();
			//CalendarNotesDAO dao = new CalendarNotesDAO(em);			
			//dao.insert(notas);
		}
		
		
		RequestDispatcher r = request.getRequestDispatcher("admin.jsp");
		r.forward(request, response);
		
	}
}