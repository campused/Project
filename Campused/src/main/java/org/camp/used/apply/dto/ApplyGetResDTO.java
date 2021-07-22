package org.camp.used.apply.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.camp.used.board.dto.BoardApplyResDTO;

import lombok.Data;

@Data
public class ApplyGetResDTO {
	
	private Long ano;
	
	private String atext;
	
	private String astate;
	
	private boolean adeleted;
	
	private LocalDateTime amoddate;
	
	private BoardApplyResDTO BoardApplyResDTO;

}
