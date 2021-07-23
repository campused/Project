package org.camp.used.file.dto;
import java.time.LocalDateTime;
import java.util.List;

import org.camp.used.board.dto.BoardGetResDTO;
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
public class FileResDTO {

	private String fuuid;
	private String fuploadpath;
	private String fname;
	private boolean ftype;
	private boolean fmain;
	private Long boardBno;
	
}
