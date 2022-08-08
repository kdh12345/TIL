package process;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;

/**
 * Servlet implementation class AllMemberServlet
 */
@WebServlet("/memberlist")
public class AllMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> memberlist = dao.selectAllMember();
		
		//table 태그형태
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String output = "";
		output = "<style> table, td{ border:2px solid blue;}</style>";
		output += "<table>";
		output += "<tr><td>아이디</td><td>이름</td><td>폰</td><td>이메일</td><td>가입날짜</td></tr>";
		for(int i = 0 ; i < memberlist.size();i++) {
			MemberDTO dto = memberlist.get(i);
			output += "<tr><td>"+dto.getId()
			+"</td><td>"+dto.getName()
			+"</td><td>"+dto.getPhone()
			+"</td><td>"+dto.getEmail()
			+"</td><td>"+dto.getRegDate()+"</td></tr>";
		}
		output+="</table>";
		out.println(output);
	}

}
