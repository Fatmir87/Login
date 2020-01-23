package loggin;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class aLog
 */
@WebServlet("/aLog")
public class aLog extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public aLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		
		
		
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		aBean obj = new aBean();
		obj.setInUsername(uname);
		obj.setInPassword(pass);
		request.setAttribute("bean", obj);
		
		try {
			//response.setContentType("text/html");
			

			String n = request.getParameter("uname");
			//out.print("");

			Cookie ck = new Cookie( "z", uname);
			//ck.setMaxAge(5);
			response.addCookie(ck);
			
			//out.print("Hello " + ck[0].getValue());
			//out.close();

		} catch (Exception e) {
			out.print("123");
		}


		if (obj.validate()) {
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		}

		else {
			RequestDispatcher rdx = request.getRequestDispatcher("Error.jsp");
			rdx.forward(request, response);
		}

	}

}
