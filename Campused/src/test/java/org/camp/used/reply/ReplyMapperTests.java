package org.camp.used.reply;

import java.util.stream.IntStream;

import org.camp.used.config.RootConfig;
import org.camp.used.reply.dto.ReplyInsertDTO;
import org.camp.used.reply.dto.ReplyUpdateDTO;
import org.camp.used.reply.mapper.ReplyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class ReplyMapperTests {
	
	@Autowired
	private ReplyMapper replyMapper;
	
	@Test
	public void testReplyInsert() {
		log.info("testInsert");
		IntStream.rangeClosed(1, 400).forEach(i -> {
			replyMapper.replyInsert(
					ReplyInsertDTO.builder()
					.rtext("테스트 내용"+i)
					.rdeleted(false)
					.boardBno((long)i)
					.memberMno((long)i)
					.build()
					);
		});
	}
	
	@Test
	public void testReplyDelete() {
		replyMapper.replyDelete(2L);
	}
	
	@Test
	public void testReplyUpdate() {
		ReplyUpdateDTO dto = ReplyUpdateDTO.builder()
				.rno(2L)
				.rtext("수정테스트용1")
				.build();
		replyMapper.replyUpdate(dto);
	}

}
