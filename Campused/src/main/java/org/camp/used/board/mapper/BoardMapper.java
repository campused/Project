package org.camp.used.board.mapper;

import java.util.List;

import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.dto.BoardSearchRequestDTO;
import org.camp.used.board.dto.BoardSearchResDTO;

public interface BoardMapper {
	
	void insert(BoardInsertDTO dto);
	
	void delete(Long bno);
	
	List<BoardSearchResDTO> getPageList(BoardSearchRequestDTO dto);
	
	int getCount(BoardSearchRequestDTO dto);

}	
