package org.camp.used.board;

import org.camp.used.config.RootConfig;
import org.camp.used.dto.BoardInsertDTO;
import org.camp.used.mapper.BoardMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testInsert() {
		log.info("testInsert");
		boardMapper.insert(
				BoardInsertDTO.builder()
				.btitle("실험용2")
				.bcontent("실험용내용2")
				.bprice("40억")
				.bdeleted(false)
				.memberMno(1L)
				.build()
				);
	}

}
