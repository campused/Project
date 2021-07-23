package org.camp.used.cart.service;

import java.util.List;

import org.camp.used.board.mapper.BoardMapper;
import org.camp.used.board.service.BoardServiceImpl;
import org.camp.used.cart.dto.CartGetResDTO;
import org.camp.used.cart.dto.CartInsertDTO;
import org.camp.used.cart.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartMapper cartMapper;
	
	public void cartInsert(CartInsertDTO dto) {
		cartMapper.cartInsert(dto);
	}

	@Override
	public void cartDelete(Long cno) {
		cartMapper.cartDelete(cno);
		
	}

	@Override
	public List<CartGetResDTO> cartGet(Long mno) {
		List<CartGetResDTO> result = cartMapper.cartGet(mno);
		return result;
	}

	
	
}
