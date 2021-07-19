package org.camp.used.member;

import java.util.Optional;
import java.util.stream.IntStream;
import org.camp.used.common.config.RootConfig;
import org.camp.used.member.dto.MemberGetOneDTO;
import org.camp.used.member.dto.MemberInsertDTO;
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
		IntStream.rangeClosed(1, 101).forEach(member -> {
			MemberInsertDTO dto = MemberInsertDTO.builder()
			.memail("kiteho"+member+"@gmail.com")
			.mnickname("testNickname"+member)
			.mpw("1111")
			.maddress("종로"+member+"가")
			.mphone("010-1234-8962"+member)
			.mauthority(1)
			.mlikecount(100L)
			.build();
			memberMapper.insert(dto);
		});
	}
	
	@Test
	public void testReadOne() {
		log.info("===testReadOne Start!!===");
		Optional<MemberGetOneDTO> result = memberMapper.selectOne(200L);
		log.info(result);
	}
	
	@Test
	public void testUpdate() {
		log.info("===testUpdate Start!!===");
		
	}
	
	
}
