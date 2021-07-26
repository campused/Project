package org.camp.used.member.mapper;

import java.util.Optional;

import org.camp.used.member.dto.MemberDTO;
import org.camp.used.member.dto.MemberDeleteDTO;
import org.camp.used.member.dto.MemberGetOneDTO;
import org.camp.used.member.dto.MemberInsertDTO;
import org.camp.used.member.dto.MemberUpdateDTO;

public interface MemberMapper {
	
	void insertMember(MemberInsertDTO dto);
	
	Optional<MemberGetOneDTO> selectOneMember(Long mno);
	
	public int updateMember(MemberUpdateDTO dto);
	
	public int deleteMember(MemberDeleteDTO dto);

}
