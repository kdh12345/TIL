package memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class MemberDAO {
	
	@Qualifier("dto1") //id=jsp
	@Autowired
	MemberDTO dto;//�쉶�썝�젙蹂댁��옣媛앹껜
	
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
	public void insertEmployee() {
		System.out.println(dto.getId() + " �떊�엯�궗�썝�쑝濡� �엯�궗�븯�뀲�뒿�땲�떎.");
	}
	
	//////////////////
	public boolean selectMember(MemberDTO dto) {
		if(dto.getId().equals("spring") && dto.getPassword() == 1111) {
			return true;// �젙�긽 濡쒓렇�씤 �궗�슜�옄 寃쎌슦 由ы꽩媛�
		}
		else {
			return false;//�쉶�썝媛��엯 寃쎌슦 由ы꽩媛�
		}
	}
	public void insertMember(MemberDTO dto) {
		System.out.println(dto.getId() + " �쉶�썝�떂 �젙�긽�쟻�쑝濡� �쉶�썝媛��엯�릺�뀲�뒿�땲�떎.");
	}
	public void insertEmployee(MemberDTO dto) {
		System.out.println(dto.getId() + " �떊�엯�궗�썝�쑝濡� �엯�궗�븯�뀲�뒿�땲�떎.");
	}
}
