package org.camp.used.cart.dto;

import java.util.List;

import org.camp.used.board.dto.BoardCartResDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartGetResDTO {
	
	private Long cno;
	
	private Long cartMno;

	private List<BoardCartResDTO> BoardCartResDTO;

}
