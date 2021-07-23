package org.camp.used.cart.service;

import java.util.List;

import org.camp.used.cart.dto.CartGetResDTO;
import org.camp.used.cart.dto.CartInsertDTO;

public interface CartService {
	
	void cartInsert(CartInsertDTO dto);
	
	void cartDelete(Long cno);
	
	List<CartGetResDTO> cartGet(Long mno);

}
