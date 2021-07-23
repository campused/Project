package org.camp.used.file.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardAttachDTO {

	private String fuuid;
	private String fuploadpath;
	private String fname;
	private boolean ftype, fmain;
	private Long bno;
	
}
