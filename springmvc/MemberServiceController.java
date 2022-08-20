package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import memberservice.MemberDTO;
import memberservice.MemberService;

@Controller
public class MemberServiceController {
	
	@Autowired
	@Qualifier("service1")
	MemberService service;
	
	@RequestMapping(value="/memberservice")
	public ModelAndView memberService(MemberDTO dto) {
		String registerResult = service.registerMember(dto);
		ModelAndView mv = new ModelAndView();
		mv.addObject("registerresult", registerResult);
		mv.setViewName("memberservice");
		return mv;
		
		
	}
}
