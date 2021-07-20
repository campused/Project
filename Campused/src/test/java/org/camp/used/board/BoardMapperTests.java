package org.camp.used.board;

import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.mapper.BoardMapper;
import org.camp.used.common.config.RootConfig;
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
				.btitle("테스트 제목1")
				.bcontent("테스트 내용1")
				.bprice("40억")
				.bdeleted(false)
				.memberMno(200L)
				.build()
				);
	}

}
