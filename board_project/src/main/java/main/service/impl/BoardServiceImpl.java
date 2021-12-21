package main.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import main.service.BoardService;
import main.service.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;

	@Override
	public String insertNBoard(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.insertNBoard(vo);
	}

	@Override
	public List<?> selectNBoardList(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.selectNBoardList(vo);
	}


//	@Override
//	public List<?> selectCodeList(CodeVO vo) throws Exception {
//		// TODO Auto-generated method stub
//		return codeDAO.selectCodeList(vo);
//	}
//
//	@Override
//	public int selectCodeCount(CodeVO vo) throws Exception {
//		// TODO Auto-generated method stub
//		return codeDAO.selectCodeCount(vo);
//	}
//
//	@Override
//	public int codeDelete(int code) throws Exception {
//		// TODO Auto-generated method stub
//		return codeDAO.codeDelete(code);
//	}
	
}