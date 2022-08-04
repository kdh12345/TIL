package process;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 요청 받아오자
		// httpServletRequest - http 요청정보객체, 
		// <form action="/register">
		// <input type=text name='id'>
		// <input type=submit value='등록전송'>
		String name    = request.getParameter("name");
		String[] subject = request.getParameterValues("subject"); 
		// 처리 결과 - 자바 구현
		
		// httpServletResponse - http 응답가능객체
		// 결과 응답 = 서버 출력(클라이언트 입력)
		// 브라우저 인코딩 - 서블릿 인코딩
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if((name != null && subject != null) && ( !name.equals("") && subject.length > 0 ))
		{
			out.println("<h1>"+name+"회원님");
			for(var i = 0 ; i < subject.length ; i++) {
				if(i < subject.length-1)
					out.println(subject[i]+", ");
				else
					out.println(subject[i]+" ");
				
			}
			out.println(" 과정을 선택하셨습니다. </h1>");
		}
				 //입력하신 id는 xxxx 입니다.
		else
			out.println("<h1>이름 혹은 과정을 입력하지 않았습니다. 확인부탁드립니다.</h1>");
	}

}
