package org.camp.used.member.mapper;

import java.util.Optional;

import org.camp.used.member.dto.MemberDTO;
import org.camp.used.member.dto.MemberDeleteDTO;
import org.camp.used.member.dto.MemberGetOneDTO;
import org.camp.used.member.dto.MemberInsertDTO;
import org.camp.used.member.dto.MemberUpdateDTO;

public interface MemberMapper {
	
	void insert(MemberInsertDTO dto);
	
	Optional<MemberGetOneDTO> selectOne(Long mno);
	
	public int update(MemberUpdateDTO dto);
	
	public int delete(MemberDeleteDTO dto);

}
