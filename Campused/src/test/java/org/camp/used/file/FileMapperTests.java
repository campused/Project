package org.camp.used.file;

import java.util.UUID;
import java.util.stream.IntStream;

import org.camp.used.board.BoardMapperTests;
import org.camp.used.config.RootConfig;
import org.camp.used.file.dto.BoardAttachDTO;
import org.camp.used.file.dto.FileInsertDTO;
import org.camp.used.file.dto.FileTestInsertDTO;
import org.camp.used.file.mapper.FileMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class FileMapperTests {

	@Autowired
	private FileMapper fileMapper;
	
	@Test
	public void testCreate() {
		log.info("===testCreate File!!===");
		IntStream.rangeClosed(1, 5).forEach(file -> {
			FileTestInsertDTO testDTO = FileTestInsertDTO.builder()
					.fuuid("testklajdklj"+file)
					.fname("테스트파일"+file)
					.fuploadpath("테스트용 업로드 경로")
					.ftype(false)
					.fmain(false)
					.board_bno(400L)
					.build();
			fileMapper.testInsertFile(testDTO);
		});
	}
	
	@Test
	public void testCreateOne() {
		log.info("===testCreate File!!===");
		UUID uuid = UUID.randomUUID();
			FileTestInsertDTO testDTO = FileTestInsertDTO.builder()
					.fuuid(uuid.toString())
					.fname("테스트파일")
					.fuploadpath("C:\\campUpload\\temp")
					.ftype(false)
					.fmain(false)
					.board_bno(400L)
					.build();
			fileMapper.testInsertFile(testDTO);
	}
	
}
