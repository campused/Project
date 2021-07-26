package org.camp.used.board.controller;

import java.util.List;
import java.util.Map;

import org.camp.used.board.dto.BoardGetResDTO;
import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.dto.BoardListResDTO;
import org.camp.used.board.dto.BoardPageResultDTO;
import org.camp.used.board.dto.BoardSearchRequestDTO;
import org.camp.used.board.dto.BoardSearchResDTO;
import org.camp.used.board.dto.BoardUpdateRequestDTO;
import org.camp.used.board.service.BoardService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/board")
@RestController
@RequiredArgsConstructor
@Log4j
public class BoardController {
	
	private final BoardService boardService;

	@PostMapping("/insert")
	public ResponseEntity<String> boardInsert(@RequestBody BoardInsertDTO dto) {
		log.info("======================");
		if(dto.getAttachList() != null) {
			dto.getAttachList().forEach(list -> {
				log.info(list);
			});
		}
		log.info("======================");
		boardService.insert(dto);
		return ResponseEntity.ok("입력 완료");
	}
	
	@DeleteMapping("/{bno}")
	public ResponseEntity<String> boardDelete(@PathVariable Long bno) {
		boardService.delete(bno);
		return ResponseEntity.ok("삭제 완료");
	}
	
	@GetMapping(value = "/{bno}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<BoardGetResDTO> boardGetOne(@PathVariable Long bno) {
		BoardGetResDTO result = boardService.getOne(bno);
		return ResponseEntity.ok(result);
	}
	
	@PutMapping("/{bno}")
	public ResponseEntity<Long> boardUpdate(@RequestBody BoardUpdateRequestDTO dto) {
		return ResponseEntity.ok(boardService.update(dto));
	}
	
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<BoardListResDTO<?>> boardGetList(BoardSearchRequestDTO dto) {
		return ResponseEntity.ok(boardService.getPageList(dto));
	}
	
	
}
