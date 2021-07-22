package org.camp.used.apply.mapper;

import java.util.List;

import org.camp.used.apply.dto.ApplyGetResDTO;
import org.camp.used.apply.dto.ApplyInsertDTO;
import org.camp.used.apply.dto.ApplyStateUpdateDTO;

public interface ApplyMapper {

	void applyInsert(ApplyInsertDTO dto);
	
	void applyDelete(Long ano);
	
	void applyStateUpdate(ApplyStateUpdateDTO dto);
	
	List<ApplyGetResDTO> applyGetList(Long mno);
	
	List<ApplyGetResDTO> applyGetMyList(Long mno);
	
}
