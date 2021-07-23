package org.camp.used.file.dto;

import lombok.Data;

@Data
public class FileResDTO {

	private String fuuid;
	private String fuploadpath;
	private String fname;
	private boolean ftype;
	private boolean fmain;
	private Long board_bno;
	
}
