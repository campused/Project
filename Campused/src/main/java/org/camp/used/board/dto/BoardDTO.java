package org.camp.used.board.dto;

import java.time.LocalDateTime;

import org.camp.used.member.dto.MemberGetOneDTO;

import lombok.Data;

@Data
public class BoardDTO {
	
	private Long bno;
	
	private boolean bstate, bdeleted;
	
	private String btitle, bcontent, bprice;
	
	private LocalDateTime bregdate, bmoddate;
	
	private Long member_mno;
	
	private String memail;
	private String mnickname;
	private String mpw;
	private String maddress;
	private String mphone;
	private int mauthority;
	private Long mlikecount;
	private LocalDateTime mregdate;
	private LocalDateTime mmoddate;

}
