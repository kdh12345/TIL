package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardservice")
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDAO dao;
	
	@Override
	public int registerBoard(BoardDTO dto) {
		return dao.insertBoard(dto);
	}

	@Override
	public int getTotalBoard() {
		return dao.getCount();
	}

	@Override
	public List<BoardDTO> paginglist(int[] limit) {
		return dao.pagingList(limit);
	}

	@Override
	public int updateSeq(int seq) {
		return dao.updateSeq(seq);
	}

	@Override
	public BoardDTO getBoardSeqLst(int seq) {
		return dao.getBoardSeqLst(seq);
	}

	@Override
	public int deleteBoard(int seq) {
		return dao.deleteBoard(seq);
	}

	@Override
	public int updateBoard(BoardDTO dto) {
		return dao.updateBoard(dto);
	}
}
