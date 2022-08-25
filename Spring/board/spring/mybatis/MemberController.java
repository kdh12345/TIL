package board.spring.mybatis;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MemberController {
	
	@Autowired
	@Qualifier("service")
	MemberService memberService;
	
	@GetMapping("/boardlogin")
	public String loginform() {
		return "board/loginform";
	}
	
	@PostMapping("/boardlogin")
	public String loginprocess(String id, int password,HttpServletRequest request) {
		HttpSession session = request.getSession();
		List<MemberDTO> list = memberService.onemember(id);
		if( list.size() == 0 ) {
			//회원가입 안되어있다.
		}else {
			int dbPassword = list.get(0).getPassword();
			if( password == dbPassword ) {
				session.setAttribute("sessionid", id);
			}
		}
		return "board/start";
	}
	
	@GetMapping("/boardlogout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("sessionid");
		return "board/start";
	}
}
