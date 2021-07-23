package org.camp.used.apply.service;

import java.util.List;

import org.camp.used.apply.dto.ApplyGetResDTO;
import org.camp.used.apply.dto.ApplyInsertDTO;
import org.camp.used.apply.dto.ApplyStateUpdateDTO;
import org.camp.used.apply.mapper.ApplyMapper;
import org.camp.used.cart.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplyServiceImpl implements ApplyService {

	@Autowired
	private ApplyMapper applyMapper;
	
	@Override
	public void applyInsert(ApplyInsertDTO dto) {
		applyMapper.applyInsert(dto);
	}

	@Override
	public void applyDelete(Long ano) {
		applyMapper.applyDelete(ano);
		
	}

	@Override
	public void applyStateUpdate(ApplyStateUpdateDTO dto) {
		applyMapper.applyStateUpdate(dto);
		
	}

	@Override
	public List<ApplyGetResDTO> applyGetList(Long mno) {
		return applyMapper.applyGetList(mno);
	}

	@Override
	public List<ApplyGetResDTO> applyGetMyList(Long mno) {
		return applyMapper.applyGetMyList(mno);
	}

}
