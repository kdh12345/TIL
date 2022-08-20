package mybatis;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import mybatis.MemberDTO;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		//설정파일 준비
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		
		SqlSessionFactory factory = builder.build(
				Resources.getResourceAsReader("mybatis/mybatis-config.xml"));
		//db 연결
		SqlSession session = factory.openSession();
		
		//sql실행
		List<MemberDTO> list = session.selectList("member.memberlist");
	
		//조회
		for(MemberDTO dto:list) {
			System.out.println(dto);
		}
		int cnt = session.selectOne("member.membercount");
		System.out.println(cnt+"!!!");

		MemberDAO dao = new MemberDAO();
		dao.setSession(session);
		MemberServiceImpl service = new MemberServiceImpl();
		service.setDao(dao);
		//key 보드 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 회원의 아이디를 입력하세요");
		String id = sc.next();
		List<MemberDTO> list2 = service.oneMember(id);
		for(MemberDTO dto : list2) {
			System.out.println(dto.getId() + ":" + dto.getName());
		}
		
		System.out.println("=========");
		//페이징처리
		int[] limit= {0,4};
		List<MemberDTO> list3 = service.pagingList(limit);
		for(MemberDTO dto : list3) {
			System.out.println(dto);
		}
		System.out.println("=========");
		
		MemberDTO dto = new MemberDTO();
		dto.setId("aaa333");
		dto.setPassword(45678);
		dto.setName("김사탕");
		dto.setPhone("01022225555");
		dto.setEmail("458@multi.com");
		int result = service.registerMember(dto);
		if(result == 1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}

}
