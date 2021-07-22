package org.camp.used.board.dto;

import lombok.Data;

@Data
public class BoardApplyResDTO {
	
	private Long bno;
	
	private boolean bstate, bdeleted;
	
	private String btitle, bcontent, bprice;

}
