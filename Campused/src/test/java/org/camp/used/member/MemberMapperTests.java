package org.camp.used.member;

import java.util.Optional;
import java.util.stream.IntStream;

import org.camp.used.config.RootConfig;
import org.camp.used.member.dto.MemberDeleteDTO;
import org.camp.used.member.dto.MemberGetOneDTO;
import org.camp.used.member.dto.MemberInsertDTO;
import org.camp.used.member.dto.MemberUpdateDTO;
import org.camp.used.member.mapper.MemberMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class MemberMapperTests {

	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void testCreate() {
		log.info("===testCreate Start!!===");
		IntStream.rangeClosed(1, 400).forEach(member -> {
			MemberInsertDTO dto = MemberInsertDTO.builder()
			.memail("kiteho"+member+"@gmail.com")
			.mnickname("testNickname"+member)
			.mpw("1111")
			.maddress("종로"+member+"가")
			.mphone("010-1234-8962"+member)
			.mauthority(1)
			.mlikecount(100L)
			.mdeleted(false)
			.build();
			memberMapper.insertMember(dto);
		});
	}
	
	@Test
	public void testReadOne() {
		log.info("===testReadOne Start!!===");
		Optional<MemberGetOneDTO> result = memberMapper.selectOneMember(4L);
		log.info(result);
	}
	
	// select를 제외한 insert update delete는 리턴값이 1(성공) 아니면 0(실패)
	@Test
	public void testUpdate() {
		log.info("===testUpdate Start!!===");
		MemberUpdateDTO dto = new MemberUpdateDTO();
		dto.setMno(4L);
		dto.setMnickname("테스트 닉네임");
		dto.setMpw("2222");
		dto.setMaddress("을지로3가");
		dto.setMphone("010-9876-4321");
		dto.setMauthority(2);
		int check = memberMapper.updateMember(dto);
		if(check == 1) {
			log.info("===success===");
		}
	}
	
	@Test
	public void testDelete() {
		log.info("===testDelete Start!!===");
		MemberDeleteDTO dto = new MemberDeleteDTO();
		dto.setMno(4L);
		dto.setMdeleted(true);
		int check = memberMapper.deleteMember(dto);
		if(check ==1) {
			log.info("===success===");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
