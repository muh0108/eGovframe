package main.service;

import java.util.List;

public interface BoardService {
	/**등록*/
	public String insertNBoard(BoardVO vo) throws Exception;
	/**목록*/
	public List<?> selectNBoardList(BoardVO vo) throws Exception;
//	public List<?> selectCodeList(CodeVO vo) throws Exception;
//	/**카운트*/
//	public int selectCodeCount(CodeVO vo) throws Exception;
//	
//	public int codeDelete(int code) throws Exception;
//	

	
}