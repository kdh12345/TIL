package memberservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {
	public static void main(String args[]) {
		//1. �뒪�봽留� bean 2媛� �깮�꽦 遺��긽 - member/member.xml
		ApplicationContext factory = new ClassPathXmlApplicationContext("memberservice/member.xml");
		MemberService service = (MemberService)factory.getBean("service1");
		service.registerMember();//�쉶�썝媛��엯湲곕뒫
		
	}
}


//main --> service-registerMember() --> dao(1,2,3...), dto