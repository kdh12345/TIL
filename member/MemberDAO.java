package member;

import org.springframework.beans.factory.annotation.Autowired;


public class MemberDAO {
	@Autowired
	MemberDTO dto;
	
	public boolean selectMember() {
		if(dto.getId().equals("spring") && dto.getPassword() == 1111) {
			return true;// �젙�긽 濡쒓렇�씤 �궗�슜�옄 寃쎌슦 由ы꽩媛�
		}
		else {
			return false;//�쉶�썝媛��엯 寃쎌슦 由ы꽩媛�
		}
	}
	public void insertMember() {
		System.out.println(dto.getId() + " �쉶�썝�떂 �젙�긽�쟻�쑝濡� �쉶�썝媛��엯�릺�뀲�뒿�땲�떎.");
	}
}
