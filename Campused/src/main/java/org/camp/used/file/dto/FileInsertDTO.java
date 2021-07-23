package org.camp.used.file.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileInsertDTO {

	private String fuuid;
	private String fuploadpath;
	private String fname;
	private boolean ftype;
	private boolean fmain;
	private Long board_bno;
	
}
