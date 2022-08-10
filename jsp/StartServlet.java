package start;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;


@WebServlet("/start")
public class StartServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String menu = request.getParameter("menu");
		if("회원정보조회".equals(menu)) {
			request.setAttribute("menu", "memberlist");
			MemberDAO dao = new MemberDAO();
			ArrayList<MemberDTO> dtos = dao.selectAllMember();
			
			RequestDispatcher rd = request.getRequestDispatcher("allmemberlist.jsp");
			rd.forward(request, response);
		}
		else if("글쓰기".equals(menu)) {
			request.setAttribute("menu", "boardwriting");
			
			RequestDispatcher rd = request.getRequestDispatcher("boardwriting.jsp");
			rd.forward(request, response);
		}
		
		/*response.setContentType("text/html;charset=utf-8");
		PrintWriter o = response.getWriter();
		o.println(menu);*/
	}

}
