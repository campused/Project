package org.camp.used.file.mapper;

import java.util.List;

import org.camp.used.file.dto.BoardAttachDTO;

public interface FileMapper {
	
	public void insertFile(BoardAttachDTO attachDTO);
	
	public Long deleteFile(Long fno);
	
	public List<BoardAttachDTO> findByBno(Long bno);
	

}
