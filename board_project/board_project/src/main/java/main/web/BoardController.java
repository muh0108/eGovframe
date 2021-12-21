package main.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping(value = "/boardWriteSave.do")
	public String boardWriteSave(BoardVO vo) throws Exception {
		String result = boardService.insertNBoard(vo);
		
		if (result == null) {
			System.out.println("저장완료");
		}else {
			System.out.println("저장실패");
		}
		
//		return "redirect:codeList.do";
		return "";
	}
//	
//	@RequestMapping(value = "/codeList.do")
//	public String selectCodeList(CodeVO vo, ModelMap model) throws Exception {
//		int total = codeService.selectCodeCount(vo);
//		List<?> codeList = codeService.selectCodeList(vo);
//		
//		model.addAttribute("resultTotal", total);
//		model.addAttribute("resultList", codeList);
//
//		return "code/codeList";
//	}
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
