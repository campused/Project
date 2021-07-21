package org.camp.used.cart;

import java.util.stream.IntStream;

import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.cart.dto.CartInsertDTO;
import org.camp.used.cart.mapper.CartMapper;
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
public class CartMapperTests {
	
	@Autowired
	private CartMapper cartMapper;
	
	@Test
	public void cartInsertTest() {
		IntStream.rangeClosed(1, 5).forEach(i -> {
			cartMapper.cartInsert(
					CartInsertDTO.builder()
					.board_bno((long)i)
					.member_mno(12L)
					.build()
					);
		});
	}
	
	@Test
	public void cartDeleteTest() {
		cartMapper.cartDelete(4L);
	}
	
	@Test
	public void cartSelectTest() {
		log.info(cartMapper.cartGet(3L));
	}

}
