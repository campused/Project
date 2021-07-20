package org.camp.used.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberUpdateDTO {

	private Long mno;
	private String mnickname;
	private String mpw;
	private String maddress;
	private String mphone;
	private int mauthority;
	
}
