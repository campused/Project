package org.camp.used.cart.controller;

import java.util.List;

import org.camp.used.board.controller.BoardController;
import org.camp.used.board.dto.BoardGetResDTO;
import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.service.BoardService;
import org.camp.used.cart.dto.CartGetResDTO;
import org.camp.used.cart.dto.CartInsertDTO;
import org.camp.used.cart.service.CartService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/cart")
@RestController
@RequiredArgsConstructor
@Log4j
public class CartController {

	private final CartService cartService;
	
	@PostMapping("/insert")
	public ResponseEntity cartInsert(@RequestBody CartInsertDTO dto) {
		cartService.cartInsert(dto);
		return ResponseEntity.ok("Cart Insert succ");
	}
	
	@DeleteMapping("/{cno}")
	public ResponseEntity cartDelete(@PathVariable Long cno) {
		cartService.cartDelete(cno);
		return ResponseEntity.ok("Cart delete succ");
	}
	
//	@GetMapping(value = "/{mno}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<List<CartGetResDTO>> cartGet(@PathVariable Long mno) {
		List<CartGetResDTO> result = cartService.cartGet(mno);
		return ResponseEntity.ok(result);
	}
	
}
