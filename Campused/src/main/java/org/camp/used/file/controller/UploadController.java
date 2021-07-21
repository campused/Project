package org.camp.used.file.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;
import net.coobird.thumbnailator.Thumbnailator;

@Controller
@Log4j
public class UploadController {
	
	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String str = sdf.format(date);
		return str.replace("-", File.separator);
	}
	
	private boolean checkImageType(File file) {
		String contentType;
		try {
			contentType = Files.probeContentType(file.toPath());
			return contentType.startsWith("image");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
/////////////////////////////////////////////////////////////////////////////
//	@GetMapping("/uploadForm")
//	public void uploadForm() {
//		log.info("upload file");
//	}
//	
//	@PostMapping("/uploadFormAction")
//	public void uploadFormPost(MultipartFile[] uploadFile, Model model) {
//		
//		String uploadFolder = "C:\\campUpload\\temp";
//		
//		for(MultipartFile multipartFile : uploadFile) {
//			log.info("==================================");
//			log.info("Upload File Name:" +multipartFile.getOriginalFilename());
//			log.info("UploadFile Size: " +multipartFile.getSize());			
//			
//			// File save
//			File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
//			try {
//				multipartFile.transferTo(saveFile);
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				log.error(e.getMessage());
//				e.printStackTrace();
//			}
//		} // end loop
//	}
	
/////////////////////////////////////////////////////////////////////////////
	
	@GetMapping("/uploadAjax")
	public void uploadAjax() {
		log.info("=========upload ajax=========");
	}
	
	@PostMapping("/uploadAjaxAction")
	public void uploadAjaxPost(MultipartFile[] uploadFile) {
		
		log.info("===update ajax post===");
		
		String uploadFolder = "C:\\campUpload\\temp";
		
		// make folder
		File uploadPath = new File(uploadFolder, getFolder());
		log.info("upload path:" + uploadPath);
		
		if(uploadPath.exists() == false) {
			uploadPath.mkdirs();
		}
		
		// start loop
		for(MultipartFile multipartFile : uploadFile) {
			log.info("==================================");
			log.info("Upload File Name:" +multipartFile.getOriginalFilename());
			log.info("UploadFile Size: " +multipartFile.getSize());
			
			String uploadFileName = multipartFile.getOriginalFilename();
			
			UUID uuid = UUID.randomUUID();
			uploadFileName = uuid.toString()+ "_" + uploadFileName;
			
			
			
			
			try {
				File saveFile = new File(uploadPath, uploadFileName); // File save
				multipartFile.transferTo(saveFile);
				// check image type
				if(checkImageType(saveFile)) {
					FileOutputStream thumbnail = new FileOutputStream(new File(uploadPath, "s_"+uploadFileName));
					Thumbnailator.createThumbnail(multipartFile.getInputStream(), thumbnail, 100, 100);
					thumbnail.close();
				}
			} catch (IOException e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		} // end loop
	}
	
/////////////////////////////////////////////////////////////////////////////
	
	
	
}