package mvc;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dto.MemberDTO;

/**
 * Servlet implementation class StartServlet
 */
@WebServlet("/start2")
public class StartServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String menu = request.getParameter("menu");
		String jspFile = "";
		if("memberlist".equals(menu)) {
			MemberDAO dao = new MemberDAO();
			ArrayList<MemberDTO> list = dao.selectAllMember();
			request.setAttribute("memberlist", list);
			jspFile = "/mvc/allmemberlist2.jsp";
		}
		else if("boardwriting".equals(menu)) {
			String id = "";
			if(request.getParameter("id") == null) {
				id = "guest";
			}
			else {
				id = request.getParameter("id");
			}
			HttpSession session = request.getSession();
			session.setAttribute("session_id", id);
			jspFile = "/mvc/boardwrite2.jsp";
		}
		else if("board".equals(menu)) {
			jspFile = "/mvc/boardsuccess.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(jspFile);
		rd.forward(request, response);
	}

}
