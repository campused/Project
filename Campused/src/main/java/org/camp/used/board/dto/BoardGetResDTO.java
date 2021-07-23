package org.camp.used.board.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.camp.used.board.dto.BoardInsertDTO.BoardInsertDTOBuilder;
import org.camp.used.file.dto.FileResDTO;
import org.camp.used.member.dto.MemberGetOneDTO;
import org.camp.used.reply.dto.ReplyResDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardGetResDTO {

	private Long bno;
	private boolean bstate;
	private String btitle, bcontent, bprice;
	private LocalDateTime bregdate;
	private LocalDateTime bmoddate;
	
	private List<FileResDTO> fileResDTO;
	
	private MemberGetOneDTO memberGetOneDTO;
	
	private List<ReplyResDTO> ReplyResDTO;
	
}
