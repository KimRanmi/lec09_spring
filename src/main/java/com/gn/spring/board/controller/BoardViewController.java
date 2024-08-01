package com.gn.spring.board.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gn.spring.board.model.service.BoardService;
import com.gn.spring.board.model.vo.Board;

@Controller
public class BoardViewController {
	
	@Autowired // 의존성(주입된 변수명 사용해서 ..)
	BoardService boardService;
	
	private static final Logger LOGGER = LogManager.getLogger(BoardViewController.class);
	
	@GetMapping("/board")
	public String selectBoardList() {
		List<Board> resultList = boardService.selectBoardList();
		LOGGER.info(resultList);
		// /WEB-INF/views/board/list.jsp
		return "/board/list";
	}
}
