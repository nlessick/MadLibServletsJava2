package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;

/**
 * Servlet implementation class getMadLibServlet
 */
@WebServlet("/getMadLibServlet")
public class getMadLibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMadLibServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String userFood = request.getParameter("userFood");
		String userAnimal = request.getParameter("userAnimal");
		String userActivity = request.getParameter("userActivity");
		
		MadLib userEntry = new MadLib(userName, userFood, userAnimal, userActivity);
		
		request.setAttribute("userMadLibPouch", userEntry);
		
		getServletContext().getRequestDispatcher("/madlibresults.jsp").forward(request, response);

		
		//PrintWriter writer = response.getWriter();
		//writer.println(userName.toString());
		//writer.println(userFood.toString());
		//writer.println(userAnimal.toString());
		//writer.println(userActivity.toString());
		//writer.println(userEntry.toString());
		//writer.close();
	}

}
