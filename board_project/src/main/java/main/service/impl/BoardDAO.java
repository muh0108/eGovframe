package main.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import main.service.BoardVO;

@Repository("boardDAO")
public class BoardDAO  extends EgovAbstractDAO{
	/**등록*/
	public String insertNBoard(BoardVO vo) throws Exception {
		return (String) insert("boardDAO.insertNBoard", vo);
	}
	/**목록*/
	public List<?> selectNBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
		return list("boardDAO.selectNBoardList", vo);
	}
	
//	public int selectCodeCount(CodeVO vo) throws Exception{
//		// TODO Auto-generated method stub
//		return (int) select("codeDAO.selectCodeCount", vo);
//	}
//	public int codeDelete(int code) throws Exception{
//		// TODO Auto-generated method stub
//		return delete("codeDAO.codeDelete",code);
//	}


}