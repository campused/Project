package org.camp.used.apply;

import java.util.List;

import org.camp.used.apply.dto.ApplyInsertDTO;
import org.camp.used.apply.dto.ApplyStateUpdateDTO;
import org.camp.used.apply.mapper.ApplyMapper;
import org.camp.used.board.BoardMapperTests;
import org.camp.used.config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class ApplyMapperTests {

	@Autowired
	private ApplyMapper applyMapper;
	
	@Test
	public void applyInsertTest() {
		applyMapper.applyInsert(
				ApplyInsertDTO.builder()
				.atext("구매요청11")
				.astate("거래 요청11")
				.adeleted(true)
				.member_mno(17L)
				.board_bno(11L)
				.build()
				);
	}
	
	@Test
	public void applyDeleteTest() {
		applyMapper.applyDelete(3L);
	}
	
	@Test
	public void applyGetListTest() {
		log.info(applyMapper.applyGetList(12L));
	}
	
	@Test
	public void applyStateUpdateTest() {
		applyMapper.applyStateUpdate(
				ApplyStateUpdateDTO.builder()
				.ano(5L)
				.astate("거래 취소")
				.build()
				);
		
	}
	
	@Test
	public void applyGetMyListTest() {
		log.info(applyMapper.applyGetMyList(11L));
	}
}
