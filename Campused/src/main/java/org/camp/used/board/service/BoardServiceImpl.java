package org.camp.used.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.camp.used.board.dto.BoardGetResDTO;
import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.dto.BoardPageResultDTO;
import org.camp.used.board.dto.BoardSearchRequestDTO;
import org.camp.used.board.dto.BoardSearchResDTO;
import org.camp.used.board.dto.BoardUpdateRequestDTO;
import org.camp.used.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	public void insert(BoardInsertDTO dto) {
		boardMapper.insert(dto);
	}

	@Override
	public void delete(Long bno) {
		boardMapper.delete(bno);
		
	}

	@Override
	public BoardGetResDTO getOne(Long bno) {
		return boardMapper.getOne(bno);
	}

	@Override
	public Long update(BoardUpdateRequestDTO dto) {
		return boardMapper.update(dto);
	}

	@Override
	public Map<List<BoardSearchResDTO>, BoardPageResultDTO> getPageList(BoardSearchRequestDTO dto) {
		List<BoardSearchResDTO> result = boardMapper.getPageList(dto);
		int totalCnt = boardMapper.getPageList(dto).get(0).getTotalCnt();
		BoardPageResultDTO dtos = new BoardPageResultDTO(dto.getPage(), dto.getSize(), totalCnt);
		
		Map<List<BoardSearchResDTO>, BoardPageResultDTO> map = new HashMap();
		map.put(result, dtos);
		
		return map;
	}
		
}
