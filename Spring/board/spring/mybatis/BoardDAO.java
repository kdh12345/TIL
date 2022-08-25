package board.spring.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository("boarddao")
public class BoardDAO {
	@Autowired
	SqlSession session;
	
	public int insertBoard(BoardDTO dto) {
		return session.insert("insertboard", dto);
	}

	public int getCount() {
		return session.selectOne("boardcount");
	}
	
	public List<BoardDTO> pagingList(int[] limit){
		return session.selectList("paginglst", limit);
	}

	public int updateSeq(int seq) {
		int rowsCount = session.update("updateseq",seq);
		return rowsCount;
	}

	public BoardDTO getBoardSeqLst(int seq) {
		
		return session.selectOne("selectboardseqlst", seq);
	}

	public int deleteBoard(int seq) {
		return session.delete("deleteSeq", seq);
	}

	public int updateBoard(BoardDTO dto) {
		return session.update("updatingBoard", dto);
	}
	
}
