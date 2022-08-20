package mybatis;

import java.util.List;

public class MemberServiceImpl implements MemberService {

	MemberDAO dao;
	
	
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<MemberDTO> memberlist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> oneMember(String id) {
		return dao.oneMember(id);
	}

	@Override
	public List<MemberDTO> pagingList(int[] limit) {
		return dao.pagingList(limit);
	}

	public int registerMember(MemberDTO dto) {
		List<MemberDTO> list = dao.oneMember(dto.getId());
		if( list == null || list.size() == 0) {
			   System.out.println(dto);
			   int rows = dao.insertMember(dto);
			   return rows;
		}
		return 0;
	}

	

	

	
}
