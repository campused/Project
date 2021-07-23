package org.camp.used.apply.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplyInsertDTO {

	private String atext;
	
	private String astate;
	
	private boolean adeleted;
	
	private LocalDateTime aregdate, amoddate;
	
	private Long member_mno, board_bno;
	
}
