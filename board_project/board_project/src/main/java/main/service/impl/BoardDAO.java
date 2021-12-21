package main.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

//import egovframework.example.sample.service.CodeVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import main.service.BoardVO;

@Repository("boardDAO")
public class BoardDAO extends EgovAbstractDAO {
	public String insertNBoard(BoardVO vo) throws Exception {
		return (String) insert("boardDAO.insertNBoard", vo);
	}

//	public List<?> selectCodeList(CodeVO vo) throws Exception {
//		return list("codeDAO.selectCodeList", vo);
//	}
//
//	public int selectCodeCount(CodeVO vo) {
//		return (int) select("codeDAO.selectCodeCount", vo);
//	}
//	
//	public int deleteCode(int code) throws Exception {
//		return delete("codeDAO.deleteCode", code);
//	}
//	
//	public CodeVO selectCodeDetail(int code) throws Exception {
//		return (CodeVO) select("codeDAO.selectCodeDetail", code);
//	}
//	
//	public int updateCode(CodeVO vo) throws Exception {
//		return update("codeDAO.updateCode", vo);
//	}
	
}
