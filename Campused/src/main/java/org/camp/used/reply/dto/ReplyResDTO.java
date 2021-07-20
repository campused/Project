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
public class ReplyResDTO {
	
	private String rtext;
	
	private boolean rdeleted;
	
	private LocalDateTime rmoddate;
	
	private Long memberMno;

}
