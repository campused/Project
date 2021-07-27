package org.camp.used.board.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.camp.used.file.dto.FileResDTO;
import org.camp.used.member.dto.MemberGetOneDTO;

import lombok.Builder;
import lombok.Data;

@Data
public class BoardSearchResDTO {

	private Long bno;
	private boolean bstate, bdeleted;
	private String btitle, bprice, bcontent;
	private LocalDateTime bmoddate;
	private String mnickname;
	private Long mno;
	private int totalCnt;
	private int replyCnt;
	private String fname;
	private String fuuid;
	private String fuploadpath;
	private String ftype;
	
}
