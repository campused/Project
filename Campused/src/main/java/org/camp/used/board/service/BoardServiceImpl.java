package org.camp.used.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.camp.used.board.dto.BoardGetResDTO;
import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.dto.BoardListResDTO;
import org.camp.used.board.dto.BoardPageResultDTO;
import org.camp.used.board.dto.BoardSearchRequestDTO;
import org.camp.used.board.dto.BoardSearchResDTO;
import org.camp.used.board.dto.BoardTotalCountDTO;
import org.camp.used.board.dto.BoardUpdateRequestDTO;
import org.camp.used.board.mapper.BoardMapper;
import org.camp.used.file.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class BoardServiceImpl implements BoardService {

	@Setter(onMethod_= @Autowired)
	private BoardMapper boardMapper;
	@Setter(onMethod_= @Autowired)
	private FileMapper fileMapper;
	
	@Transactional
	public void insert(BoardInsertDTO dto) {
		boardMapper.insert(dto); // 보드에 관련된것만 저장
		if(dto.getAttachList() == null || dto.getAttachList().size() <=0) {
			return;
		}// file 유효성 처리
		dto.getAttachList().forEach(file -> {
			fileMapper.insertFile(file);
		});// 파일만 뽑아서 따로 저장
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
	public BoardListResDTO<BoardSearchResDTO> getPageList(BoardSearchRequestDTO dto) {
		List<BoardSearchResDTO> result = boardMapper.getPageList(dto);;
		log.info(result);
		BoardTotalCountDTO totalCount = boardMapper.getAllCount();
		int totalCnt = totalCount.getTotalCount();
		log.info(totalCnt);
		BoardPageResultDTO dtos = new BoardPageResultDTO(dto.getPage(), dto.getSize(), totalCnt);	
		return BoardListResDTO.<BoardSearchResDTO>builder()
				.boardSearchResDTO(result)
				.boardPageResultDTO(dtos)
				.build();
	}
		
}
