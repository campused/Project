package org.camp.used.cart.mapper;

import java.util.List;

import org.camp.used.cart.dto.CartGetResDTO;
import org.camp.used.cart.dto.CartInsertDTO;

public interface CartMapper {

	void cartInsert(CartInsertDTO dto);
	
	void cartDelete(Long cno);
	
	List<CartGetResDTO> cartGet(Long mno);
	
}
