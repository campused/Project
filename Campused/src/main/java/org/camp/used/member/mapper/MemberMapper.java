package org.camp.used.member.mapper;

import java.util.Optional;

import org.camp.used.member.dto.MemberGetOneDTO;
import org.camp.used.member.dto.MemberInsertDTO;

public interface MemberMapper {
	
	void insert(MemberInsertDTO dto);
	
	Optional<MemberGetOneDTO> selectOne(Long mno);

}
