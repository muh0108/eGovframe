package main.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import main.service.BoardService;
import main.service.BoardVO;

//import egovframework.example.sample.service.CodeService;
//import egovframework.example.sample.service.CodeVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;

	@Override
	public String insertNBoard(BoardVO vo) throws Exception {
		return boardDAO.insertNBoard(vo);
	}
	
//	@Override
//	public List<?> selectCodeList(CodeVO vo) throws Exception {
//		return codeDAO.selectCodeList(vo);
//	}
//
//	@Override
//	public int selectCodeCount(CodeVO vo) throws Exception {
//		return codeDAO.selectCodeCount(vo);
//	}
//
//	@Override
//	public int deleteCode(int code) throws Exception {
//		return codeDAO.deleteCode(code);
//	}
//
//	@Override
//	public CodeVO selectCodeDetail(int code) throws Exception {
//		return codeDAO.selectCodeDetail(code);
//	}
//
//	@Override
//	public int updateCode(CodeVO vo) throws Exception {
//		return codeDAO.updateCode(vo);
//	}

}
