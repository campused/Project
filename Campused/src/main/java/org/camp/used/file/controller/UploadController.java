package org.camp.used.file.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class UploadController {
	
	
	@GetMapping("/upload")
	public void upload() {
		
		log.info("upload file");
	}
	
}
