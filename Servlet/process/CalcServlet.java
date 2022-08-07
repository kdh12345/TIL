package process;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String str_su1 = request.getParameter("su1");
		String str_su2 = request.getParameter("su2");
		
		if(str_su1 == null || str_su1.equals("") || str_su2 == null || str_su2.equals("")) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<h1><a href='calc.html'> 다시 입력하기 </a></h1><br>");
			out.println("<h2>입력 안 한 숫자가 있습니다.</h2>");
		}else {
			int su1 = Integer.parseInt(request.getParameter("su1"));
			int su2 = Integer.parseInt(request.getParameter("su2"));
			String op = request.getParameter("op");
			
			String result = "";
			if("+".equals(op)) {
				result = su1 + op + su2 +"=" + (su1+su2);
			}
			else if("-".equals(op)) {
				result = su1 + op + su2 +"=" + (su1-su2);
			}
			else if("*".equals(op)) {
				result = su1 + op + su2 +"=" + (su1*su2);
			}
			else if("/".equals(op)) {
				result = su1 + op + su2 +"=" + (su1/su2);
			}
			else if("%".equals(op)) {
				result = su1 + op + su2 +"=" + (su1%su2);
			}else {
				result = "지원하지 않는 연산자입니다.";
			}
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<h2>"+result+"</h2>");
		}
		
	}

}
