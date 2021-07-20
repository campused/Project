package org.camp.used.board.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.camp.used.member.dto.MemberGetOneDTO;

import lombok.Builder;
import lombok.Data;

@Data
public class BoardSearchResDTO {

	private Long bno;
	private boolean bstate, bdeleted;
	private String btitle, bcontent, bprice;
	private LocalDateTime bregdate, bmoddate;
	private Long member_mno;
	private int totalCnt;
	private int replyCnt;
	
	private MemberGetOneDTO memberGetOneDTO;
	
}
