package main.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import main.service.BoardService;
import main.service.BoardVO;

@Controller
public class BoardController {
	@Resource(name = "boardService")
	private BoardService boardService;
	
	@RequestMapping(value = "/boardWrite.do")
	public String boardWrite() {
		return "board/boardWrite";
	}
//	http://localhost:9080/board_project/boardWrite.do
	@RequestMapping(value = "/boardWriteSave.do")
	@ResponseBody
	public String boardWriteSave(BoardVO vo) throws Exception {
		String result = boardService.insertNBoard(vo);
		
		String msg="";
		if (result == null) {
			System.out.println("저장완료");
			msg="ok";
		}else {
			System.out.println("저장실패");
			msg="fail";
		}
		
//		return "redirect:codeList.do";
		System.out.println(msg);
		return msg;
	}
	
	@RequestMapping(value = "/boardList.do")
	public String selectNBoardList(BoardVO vo, ModelMap model) throws Exception {
		List<?> boardList = boardService.selectNBoardList(vo);
		
		model.addAttribute("resultList", boardList);

		return "board/boardList";
	}
//	
//	@RequestMapping("/codeDelete.do")
//	public String codeDelete(int code) throws Exception {
//		int result = codeService.deleteCode(code);
//		System.out.println("@@@### result ===>"+result);
//		
//		return "redirect:codeList.do";
//	}
//	
//	@RequestMapping("/codeModify.do")
//	public String codeModify(int code, ModelMap model) throws Exception {
//		CodeVO vo = codeService.selectCodeDetail(code);
//		model.addAttribute("codeVO", vo);
//
//		return "code/codeModifyWrite";
//	}
//	
//	@RequestMapping("/codeModifyWrite.do")
//	public String codeModifyWrite(CodeVO vo) throws Exception {
//		int result = codeService.updateCode(vo);
//		System.out.println("@@@### result ===>"+result);
//		
//		return "redirect:codeList.do";
//	}

}
