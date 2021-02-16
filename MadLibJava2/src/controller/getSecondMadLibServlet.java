package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;
import model.SecondMadLib;

/**
 * Servlet implementation class getSecondMadLibServlet
 */
@WebServlet("/getSecondMadLibServlet")
public class getSecondMadLibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSecondMadLibServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String userLocation = request.getParameter("userLocation");
		String userFirstNoun = request.getParameter("userFirstNoun");
		String userSecondNoun = request.getParameter("userSecondNoun");
		String userPluralNoun = request.getParameter("userPluralNoun");
		String userFirstAdjective = request.getParameter("userFirstAdjective");
		String userSecondAdjective = request.getParameter("userSecondAdjective");
		
		SecondMadLib userEntry = new SecondMadLib(userName, userLocation, userFirstNoun, userSecondNoun, userPluralNoun, userFirstAdjective, userSecondAdjective);
		
		request.setAttribute("userSecondMadLibPouch", userEntry);
		
		getServletContext().getRequestDispatcher("/secondmadlibresults.jsp").forward(request, response);

		
		//PrintWriter writer = response.getWriter();
		//writer.println(userName.toString());
		//writer.println(userLocation.toString());
		//writer.println(userFirstNoun.toString());
		//writer.println(userSecondNoun.toString());
		//writer.println(userPluralNoun.toString());
		//writer.println(userFirstAdjective.toString());
		//writer.println(userSecondAdjective.toString());
		//writer.println(userEntry.toString());
		//writer.close();
	}

}
