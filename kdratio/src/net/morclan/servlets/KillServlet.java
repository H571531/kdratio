package net.morclan.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.morclan.eao.KillsEAO;
import net.morclan.enteties.Kill;
import net.morclan.utils.LoginUtils;
import net.morclan.utils.TownNames;
//

/**
 * Servlet implementation class KillServlet
 */
@WebServlet("/KillServlet")
public class KillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private KillsEAO kEAO;
	private List<Kill> list;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!LoginUtils.brukerErInnlogget(request)) {
			response.sendRedirect("LoginServlet?trengerLogin");
		} else {
		list=kEAO.getAll();
		List<String> locations=Arrays.asList(TownNames.getTownNames());
		request.setAttribute("Locations", locations);
		request.setAttribute("Kills", list);
		request.getRequestDispatcher("WEB-INF/JSP/Kills.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
