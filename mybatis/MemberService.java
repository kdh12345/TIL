package mybatis;

import java.util.List;

public interface MemberService {
	public List<MemberDTO> memberlist();
	public List<MemberDTO> oneMember(String id);
	public List<MemberDTO> pagingList(int[] limit);
	public int registerMember(MemberDTO dto);
}