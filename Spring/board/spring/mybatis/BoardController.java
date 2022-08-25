package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@Autowired
	@Qualifier("boardservice")
	BoardService service;
	
	@RequestMapping("/")
	public String start() {
		return "board/start";
	}
	
	@GetMapping("/boardwrite")
	public String writingform() {
		return "board/writingform";
	}
	
	@PostMapping("/boardwrite")
	public ModelAndView writingprocess(BoardDTO dto) {
		//title, contents, writer, pw 저장 상태
		//dto.setViewcount(0);
		
		int insertcount = service.registerBoard(dto);
		ModelAndView mv = new ModelAndView();
		mv.addObject("insertcount", insertcount);
		mv.setViewName("board/writingprocess");
		return mv;
	}
	
	@GetMapping("/boardlist")
	public ModelAndView boardlist(@RequestParam(value="page", required = false, defaultValue = "1") int page) {
		int totalboard = service.getTotalBoard();
		
		//3개만 조회
		List<BoardDTO> boardlst = service.paginglist(new int[] {(page-1)*3, 3});
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardlst", boardlst);
		mv.addObject("totalboard",totalboard);
		mv.setViewName("board/list");
		return mv;
	}
	
	@GetMapping("/boarddetail")
	public ModelAndView boarddetail(int seq) {
		
		//해당 게시물 조회수 + 1
		int updateCount = service.updateSeq(seq);
	
		//조회 리턴
		BoardDTO dto = service.getBoardSeqLst(seq);
		ModelAndView mv = new ModelAndView();
		mv.addObject("updateSeq",updateCount);
		mv.addObject("seqList",dto);
		mv.setViewName("board/detail");
		return mv;
	}
	
	@GetMapping("/boarddelete")
	public ModelAndView boardDelete(int seq) {
		ModelAndView mv = new ModelAndView();
		int deleteCount = service.deleteBoard(seq);
		if(deleteCount == 1) {
			mv.addObject("complete",seq+"번 글이 삭제되었습니다.");
			mv.setViewName("board/start");
		}
		return mv;
	}
	
	@GetMapping("/boardupdate")
	ModelAndView updateBoard(int seq) {
		//seq 글 조회 (BoardDTO)
		BoardDTO dto = service.getBoardSeqLst(seq);
		ModelAndView mv = new ModelAndView();
		mv.addObject("updated_board",dto);
		mv.setViewName("board/updateform");
		return mv;
	}
	
	@PostMapping("/boardupdate")
	String updateBoard(BoardDTO dto) {
		//seq 글 수정 (BoardDTO)
		service.updateBoard(dto);
		return "redirect:/boardlist";
	}
	
}
