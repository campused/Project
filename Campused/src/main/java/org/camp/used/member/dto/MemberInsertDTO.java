package org.camp.used.member.dto;

import java.time.LocalDateTime;

import org.camp.used.board.dto.BoardInsertDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInsertDTO {

	private String memail;
	private String mnickname;
	private String mpw;
	private String maddress;
	private String mphone;
	private int mauthority;
	private Long mlikecount;
	private LocalDateTime mregDate;
	private LocalDateTime mmodDate;
	
}
