package process;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dto.MemberDTO;

/**
 * Servlet implementation class UpdateDBServlet
 */
@WebServlet("/updatedb")
public class UpdateDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		String userId  = (String)session.getAttribute("user_id");
		String pw   = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		MemberDTO dto = new MemberDTO();
		MemberDAO dao = new MemberDAO();
		dto = dao.SelectMember2(userId);
		if(dto!= null) {
			if(pw == null || pw.equals("") ) {
				pw = Integer.toString(dto.getPassword());
			}
			if(name == null || name.equals("") ) {
				name = dto.getName();
			}
			if(phone == null || phone.equals("") ) {
				phone = dto.getPhone();
			}
			if(email == null || email.equals("")) {
				email = dto.getEmail();
			}
		}
		
		dto = new MemberDTO();
		dto.setId(userId);
		dto.setPassword(Integer.parseInt(pw));
		dto.setName(name);
		dto.setPhone(phone);
		dto.setEmail(email);
		
		System.out.println(userId+"???");
		
		
		dao = new MemberDAO();
		int rows = dao.updateMember(dto);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter o = response.getWriter();
		if( rows >= 1 ) {
			o.println("<h1>회원정보 수정 처리되셨습니다.</h1>");
		}
		System.out.println(rows+"!!!!");
	}

}
