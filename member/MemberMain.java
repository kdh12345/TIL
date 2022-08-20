package member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {
	public static void main(String args[]) {
		//1. �뒪�봽留� bean 2媛� �깮�꽦 遺��긽 - member/member.xml
		ApplicationContext factory = new ClassPathXmlApplicationContext("member/member.xml");
		
		MemberDAO dao = (MemberDAO)factory.getBean("dao");

		boolean result = dao.selectMember();  
		if(result == true){
			System.out.println(dao.dto.getId() + " �떂 �젙�긽 濡쒓렇�씤 �궗�슜�옄�엯�땲�떎.");
		}
		else {
			dao.insertMember();
		}
	}
}
