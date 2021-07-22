package org.camp.used.board.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.camp.used.file.dto.BoardAttachDTO;

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
	
	private List<BoardAttachDTO> attachList; // 파일업로드, 게시판 insert할때 같이 넣기위해
	
}
