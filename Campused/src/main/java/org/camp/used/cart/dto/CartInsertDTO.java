package org.camp.used.cart.dto;

import java.time.LocalDateTime;

import org.camp.used.board.dto.BoardInsertDTO;
import org.camp.used.board.dto.BoardInsertDTO.BoardInsertDTOBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartInsertDTO {

	private Long member_mno, board_bno;
	
	private LocalDateTime cregdate, cmoddate;
	
}
