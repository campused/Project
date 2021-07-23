package org.camp.used.apply.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplyStateUpdateDTO {
	
	private Long ano;

	private String astate;
	
}
