package springmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {

	
	@Override
	public ModelAndView handleRequest(HttpServletRequest reqeust, HttpServletResponse response) {
		ArrayList<HelloDTO> dtos = new ArrayList<HelloDTO>();
		for(int i = 0; i < 5; i++) {
			HelloDTO dto = new HelloDTO();
			//model 값 저장
			dto.setMessage("컨트롤러가 jsp로 전달하는 모델입니다."+i);
			dtos.add(dto);
			
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("model",dtos);
		mv.setViewName("list");
		//view 설정
		return mv;
	}

}
