package org.camp.used.board.dto;

import lombok.Data;

@Data
public class BoardCartResDTO {

	private Long bno;
	
	private Long member_mno;
	
	private boolean bstate;
	
	private String btitle, bcontent, bprice;
	
}
