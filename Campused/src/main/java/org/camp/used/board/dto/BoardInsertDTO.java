package org.camp.used.board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardInsertDTO {
	
	private int bstate;
	private String btitle;
	private String bcontent;
	private String bprice;
	private boolean bdeleted;
	private LocalDateTime bregdate;
	private LocalDateTime bmoddate;
	private Long memberMno;
	
}
