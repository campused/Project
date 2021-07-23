package org.camp.used.reply.mapper;

import java.util.List;

import org.camp.used.reply.dto.ReplyInsertDTO;
import org.camp.used.reply.dto.ReplyResDTO;
import org.camp.used.reply.dto.ReplyUpdateDTO;

public interface ReplyMapper {

	void replyInsert(ReplyInsertDTO dto); 
	
	void replyDelete(Long rno);
	
	void replyUpdate(ReplyUpdateDTO dto);
	
}
