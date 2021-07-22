package org.camp.used.reply.service;

import org.camp.used.reply.dto.ReplyInsertDTO;
import org.camp.used.reply.dto.ReplyUpdateDTO;

public interface ReplyService {

	void replyInsert(ReplyInsertDTO dto); 
	
	void replyDelete(Long rno);
	
	void replyUpdate(ReplyUpdateDTO dto);
	
}
