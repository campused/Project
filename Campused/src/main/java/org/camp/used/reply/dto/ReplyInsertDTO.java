package org.camp.used.reply.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyInsertDTO {

	private String rtext;
	
	private boolean rdeleted;
	
	private LocalDateTime rregdate, rmoddate;
	
	private Long boardBno, memberMno;

}
