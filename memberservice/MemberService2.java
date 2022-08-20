package memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service2")
public class MemberService2 implements MemberService {

	@Autowired
	MemberDAO dao;
	
	@Override
	public void registerMember() {
	if(dao.selectMember() == false) {
		dao.insertMember();
	}
}

	@Override
	public String registerMember(MemberDTO dto) {
		if(dao.selectMember(dto) == false) {
			dao.insertMember(dto);
			dao.insertEmployee(dto);
			return "회원가입되셨습니다";
		}else {
			return "회원가입할 수 없습니다.(중복 아이디)";
		}
	}

}
