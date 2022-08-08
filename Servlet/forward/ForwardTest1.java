package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardTest1
 */
@WebServlet("/forward1")
public class ForwardTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		id = id.toUpperCase();
		
		request.setAttribute("upperid", id);
		RequestDispatcher rd = request.getRequestDispatcher("forward2");
		rd.forward(request, response);
		/*response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println(id+"회원님 반갑습니다.");*/
	}

}
