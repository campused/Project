package org.camp.used.reply.controller;

import org.camp.used.board.dto.BoardUpdateRequestDTO;
import org.camp.used.reply.dto.ReplyInsertDTO;
import org.camp.used.reply.dto.ReplyUpdateDTO;
import org.camp.used.reply.service.ReplyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/reply")
@RestController
@RequiredArgsConstructor
@Log4j
public class ReplyController {

	private final ReplyService replyService;
	
	@PostMapping("/insert")
	public ResponseEntity replyInsert(@RequestBody ReplyInsertDTO dto) {
		replyService.replyInsert(dto);
		return ResponseEntity.ok("댓글 입력 완료");
	}
	
	@DeleteMapping("/{rno}")
	public ResponseEntity boardDelete(@PathVariable Long rno) {
		replyService.replyDelete(rno);
		return ResponseEntity.ok("삭제 완료");
	}
	
	@PutMapping("/{rno}")
	public ResponseEntity boardUpdate(@RequestBody ReplyUpdateDTO dto) {
		replyService.replyUpdate(dto);
		return ResponseEntity.ok("reply update succ");
	}
	
}
