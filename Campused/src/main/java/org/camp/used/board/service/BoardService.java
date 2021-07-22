package org.camp.used.board.service;

import java.util.List;
import java.util.Map;

import org.camp.used.board.dto.BoardGetResDTO;
import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.dto.BoardPageResultDTO;
import org.camp.used.board.dto.BoardSearchRequestDTO;
import org.camp.used.board.dto.BoardSearchResDTO;
import org.camp.used.board.dto.BoardUpdateRequestDTO;

public interface BoardService {

	public void insert(BoardInsertDTO dto);
	
	void delete(Long bno);
	
	BoardGetResDTO getOne(Long bno);
	
	Long update(BoardUpdateRequestDTO dto);
	
	Map<List<BoardSearchResDTO>, BoardPageResultDTO> getPageList(BoardSearchRequestDTO dto);
}
