package org.camp.used.board;

import java.util.stream.IntStream;

import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.dto.BoardPageResultDTO;
import org.camp.used.board.dto.BoardSearchRequestDTO;
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
		IntStream.rangeClosed(1, 100).forEach(i -> {
			boardMapper.insert(
					BoardInsertDTO.builder()
					.btitle("테스트 제목"+i)
					.bcontent("테스트 내용"+i)
					.bprice(i+"만원")
					.bdeleted(false)
					.memberMno((long)i)
					.build()
					);
		});
	}
	
	@Test
	public void testDelete() {
		log.info("testDelete");
		boardMapper.delete(1L);
	}
	
	@Test
	public void testSearch() {
		BoardSearchRequestDTO dto = BoardSearchRequestDTO.builder()
				.page(1)
				.size(10)
				.type("c")
				.keyword("김밥")
				.build();
		
		log.info(dto);
		int totalCnt = boardMapper.getPageList(dto).get(0).getTotalCnt();
		
		boardMapper.getPageList(dto).forEach(boardMapper -> {
			log.info(boardMapper);
		});
		
		BoardPageResultDTO dtos = new BoardPageResultDTO(dto.getPage(), dto.getSize(), totalCnt);
		log.info(dtos);
	}
	
	@Test
	public void testBoardGetOne() {
		log.info(boardMapper.getOne(2L));
	}

	

}
