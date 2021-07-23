package org.camp.used.file.mapper;

import java.util.List;

import org.camp.used.file.dto.BoardAttachDTO;
import org.camp.used.file.dto.FileInsertDTO;
import org.camp.used.file.dto.FileTestInsertDTO;

public interface FileMapper {
	
	public void testInsertFile(FileTestInsertDTO dto);
	
	public void insertFile(FileInsertDTO dto);
	
	public Long deleteFile(Long fno);
	
	public List<BoardAttachDTO> findByBno(Long bno);
	

}
