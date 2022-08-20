package nonspringmvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트 서버 진입 대문
		String uri = request.getRequestURI(); // /nonspringmvc/hello
		String uri_array[] = uri.split("/");
		
		String result = uri_array[uri_array.length-1];
		System.out.println(result);
		
		HandlerMapping mappings = new HandlerMapping(); // put("hello", new ...);
		Controller con = mappings.getController(result);
		String viewName = con.handleAndRequest(request, response); //HelloDTO 모델 값 저장 - hello.jsp 뷰이름 리턴
		//view 이름 리턴
		RequestDispatcher rd = request.getRequestDispatcher(viewName);
		rd.forward(request, response);
	}

}
