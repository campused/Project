package org.camp.used.board.mapper;

import java.util.List;

import org.camp.used.board.dto.BoardGetResDTO;
import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.dto.BoardSearchRequestDTO;
import org.camp.used.board.dto.BoardSearchResDTO;
import org.camp.used.board.dto.BoardTotalCountDTO;
import org.camp.used.board.dto.BoardUpdateRequestDTO;

public interface BoardMapper {
	
	void insert(BoardInsertDTO dto);
	
	void delete(Long bno);
	
	BoardGetResDTO getOne(Long bno);
	
	BoardTotalCountDTO getAllCount();
	
	List<BoardSearchResDTO> getPageList(BoardSearchRequestDTO dto);
	
	Long update(BoardUpdateRequestDTO dto);
	
}	
