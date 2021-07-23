package org.camp.used.file.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileTestInsertDTO {
	
	private String fuuid;
	private String fname;
	private String fuploadpath;
	private boolean ftype;
	private boolean fmain;
	private Long board_bno;

}
