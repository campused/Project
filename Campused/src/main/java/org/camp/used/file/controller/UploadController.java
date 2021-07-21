package org.camp.used.file.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.camp.used.file.dto.AttachFileDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@PostMapping(value = "/uploadAjaxAction", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<List<AttachFileDTO>> uploadAjaxPost(MultipartFile[] uploadFile) {
		
		log.info("===update ajax post===");
		List<AttachFileDTO> list = new ArrayList<>();
		String uploadFolder = "C:\\campUpload\\temp";
		
		String uploadFolderPath = getFolder();
		// make folder path
		File uploadPath = new File(uploadFolder, uploadFolderPath);
		log.info("upload path:" + uploadPath);
		
		if(uploadPath.exists() == false) {
			uploadPath.mkdirs();
		}// make folder
		
		// start loop
		for(MultipartFile multipartFile : uploadFile) {
			
			AttachFileDTO attachFileDTO = new AttachFileDTO();
			
			String uploadFileName = multipartFile.getOriginalFilename();
			
			log.info("==================================");
			log.info("Upload File Name:" +multipartFile.getOriginalFilename());
			log.info("UploadFile Size: " +multipartFile.getSize());
			attachFileDTO.setFileName(uploadFileName);
			log.info("===only file name:" + uploadFileName);
			
			UUID uuid = UUID.randomUUID();
			uploadFileName = uuid.toString()+ "_" + uploadFileName;
			
			try {
				File saveFile = new File(uploadPath, uploadFileName); 
				multipartFile.transferTo(saveFile); // File save
				
				attachFileDTO.setUuid(uuid.toString());
				attachFileDTO.setUploadPath(uploadFolderPath);
				
				// check image type
				if(checkImageType(saveFile)) {
					attachFileDTO.setImage(true);
					FileOutputStream thumbnail = new FileOutputStream(new File(uploadPath, "s_"+uploadFileName));
					Thumbnailator.createThumbnail(multipartFile.getInputStream(), thumbnail, 100, 100);
					thumbnail.close();
				}
				
				list.add(attachFileDTO);
				
			} catch (IOException e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		} // end loop
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
/////////////////////////////////////////////////////////////////////////////
	
	
	
}
