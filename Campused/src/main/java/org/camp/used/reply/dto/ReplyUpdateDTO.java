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
public class ReplyUpdateDTO {
	
	private Long rno;
	
	private String rtext;
	
	private LocalDateTime rmoddate;

}
