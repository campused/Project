package org.camp.used.apply.controller;

import java.util.List;

import org.camp.used.apply.dto.ApplyGetResDTO;
import org.camp.used.apply.dto.ApplyInsertDTO;
import org.camp.used.apply.dto.ApplyStateUpdateDTO;
import org.camp.used.apply.service.ApplyService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/apply")
@RestController
@RequiredArgsConstructor
@Log4j
public class ApplyController {

		private final ApplyService applyService;
		
		@PostMapping("/insert")
		public ResponseEntity applyInsert(@RequestBody ApplyInsertDTO dto) {
			applyService.applyInsert(dto);
			return ResponseEntity.ok("Apply Insert succ");
		}
		
		@DeleteMapping("/{ano}")
		public ResponseEntity applyDelete(@PathVariable Long ano) {
			applyService.applyDelete(ano);
			return ResponseEntity.ok("Apply Delete succ");
		}
		
		@PutMapping("/update")
		public ResponseEntity applyUpdate(@RequestBody ApplyStateUpdateDTO dto) {
			applyService.applyStateUpdate(dto);
			return ResponseEntity.ok("Apply Update succ");
		}
		
		@GetMapping(value = "/list/{mno}", produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public ResponseEntity<List<ApplyGetResDTO>> applyGetList(@PathVariable Long mno) {
			List<ApplyGetResDTO> result = applyService.applyGetList(mno);
			return ResponseEntity.ok(result);
		}
		
		@GetMapping(value = "/myList/{mno}", produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public ResponseEntity<List<ApplyGetResDTO>> applyGetMyList(@PathVariable Long mno) {
			List<ApplyGetResDTO> result = applyService.applyGetMyList(mno);
			return ResponseEntity.ok(result);
		}

	
}
