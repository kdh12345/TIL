package board.spring.mybatis;

import java.util.List;

public interface BoardService {
	public int registerBoard(BoardDTO dto) ;
	public int getTotalBoard();
	public List<BoardDTO> paginglist(int[] limit);
	public int updateSeq(int seq);
	public BoardDTO getBoardSeqLst(int seq);
	public int deleteBoard(int seq);
	public int updateBoard(BoardDTO dto);
}
