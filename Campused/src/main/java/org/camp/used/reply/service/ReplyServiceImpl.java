package org.camp.used.reply.service;

import org.camp.used.board.service.BoardServiceImpl;
import org.camp.used.reply.dto.ReplyInsertDTO;
import org.camp.used.reply.dto.ReplyUpdateDTO;
import org.camp.used.reply.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private ReplyMapper replyMapper;
	
	public void replyInsert(ReplyInsertDTO dto) {
		replyMapper.replyInsert(dto);
	}

	@Override
	public void replyDelete(Long rno) {
		replyMapper.replyDelete(rno);
	}

	@Override
	public void replyUpdate(ReplyUpdateDTO dto) {
		replyMapper.replyUpdate(dto);
		
	}

}
