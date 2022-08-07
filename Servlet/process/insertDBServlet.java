package process;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;

/**
 * Servlet implementation class insertdDBServlet
 */
@WebServlet("/insertdb")
public class insertDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); //한글 깨짐방지
		response.setContentType("text/html;charset=utf-8");
		PrintWriter o = response.getWriter();
		String output = "";
		
		String id = request.getParameter("id");
		int pw = Integer.parseInt(request.getParameter("pw"));
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String regDate = LocalDateTime.now().toString();
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPassword(pw);
		dto.setName(name);
		dto.setPhone(phone);
		dto.setEmail(email);
		dto.setRegDate(regDate);
		
		MemberDAO dao = new MemberDAO();
		int condition = dao.selectMember(id, Integer.toString(pw));
		if(condition == 3) { //가입안되어 있는 케이스(해당 아이이로 가입 가능)
			int rowCnt = dao.insertMember(dto);
			if(rowCnt == 1) {
				output = "<h1>회원가입이 성공적으로 완료되었습니다.</h1>";
				o.println(output);
			}
		}else {
			output = "<h1>아이디는 중복되었습니다.<a href='insertdb.html>다시 회원가입</a></h1>";
		}
		
		
	}

}
