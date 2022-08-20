package nonspringmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListController implements Controller {

	@Override
	public String handleAndRequest(HttpServletRequest reqeust, HttpServletResponse response) {
		ArrayList<HelloDTO> dtos = new ArrayList<HelloDTO>();
		HelloDTO dto;
		for(int i = 0; i < 5; i++) {
			dto = new HelloDTO();
			//model 값 저장
			dto.setMessage("컨트롤러가 jsp로 전달하는 모델입니다.");
			dtos.add(dto);
			
		}
		reqeust.setAttribute("model", dtos);
		//view 설정
		return "list.jsp";
	}

}
