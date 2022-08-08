package process;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/logindb")
public class loginDBServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id   = request.getParameter("id");
		String pw   = request.getParameter("pw");
		
		MemberDAO dao = new MemberDAO();
		int condition = dao.selectMember(id,pw);
		
		String output = "";
		if(condition == 2) {
			String role = request.getParameter("role");
			
			if(role.equals("admin")) {
				output = id+" 계정의 관리자님 로그인하셨습니다 <br>";
				output += "<ul><li> <a href='memberlist'>모든 사용자 정보 조회 </a></li>";
				output += "<li> 블랙리스트 관리 </li>";
				output += "<li> 상품관리 </li></ul>";
			}
			else if(role.equals("user")){
				output = id+" 계정의 사용자님 로그인하셨습니다";
				output += "<ol><li> 내정보 조회</li>";
				output += "<ol><li><a href='updatedb.html'> 내정보 수정</a></li>";
				output += "<li> <a href='delete?id="+id+"&pw="+pw+"'>회원탈퇴</a></li>";
				output += "<li> 로그아웃 </li>";
				output += "<li> 게시판 보기 </li></ol>";
				
				HttpSession session = request.getSession();
				session.setAttribute("user_id", id);
			}
		}
		else if(condition == 1) { // id맞고 pw틀림
			output = "<a href='logindb.html'>로그인하러 가기</a><br>";
			output+= "<h2>비밀번호 틀렸습니다.</h2>";
		}
		else { // condition == 3 id x pw x
			output = "<h3>회원가입하신 적이 없네요</h3>";
			output += "<a href='insertdb.html'>회원가입하러 가기</a>";
		}
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(output);
		
		//response.sendRedirect("http://127.0.0.1:8080/servlettest/calc.html");
	}

}
