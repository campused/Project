package org.camp.used.board.dto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lombok.Data;

@Data
public class BoardPageResultDTO {
	
	private boolean prev, next;
	private int page, size, totalCount;
	private int start, end;
	private List<Integer> pageNumList;
	
	public BoardPageResultDTO(int page, int size, int totalCount) {
		
        this.page = page;
        this.size = size;
        this.totalCount = totalCount;

        int totalPage = (int) (Math.ceil(totalCount/(double)size));
        int tempEnd = (int) (Math.ceil(page/10.0) * 10);
        int start = tempEnd - 9;
        int end = totalPage > tempEnd ? tempEnd : totalPage;
        prev = start > 1;
        next = totalPage > tempEnd;
        pageNumList = IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList());
		
	}
	
}
