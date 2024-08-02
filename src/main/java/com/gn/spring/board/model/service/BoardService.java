package com.gn.spring.board.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gn.spring.board.model.dao.BoardDao;
import com.gn.spring.board.model.vo.Board;

@Service
public class BoardService {
	
	@Autowired
	BoardDao boardDao;
	
	// 리스트 추출
	public List<Board> selectBoardList(Board option){
		List<Board> resultList = new ArrayList<Board>();
		try {
			resultList = boardDao.selectBoardList(option);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}
	
	// 페이징
	public int selectBoardCount(Board option) {
		int result = 0;
		try {
			result = boardDao.selectBoardCount(option);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	// insert
	public int insertBoard(Board option) {
		int result = 0;
		try {
			result = boardDao.insertBoard(option);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// 상세보기 
	public Board selectBoardOne(int board_no) {
		Board board = null;
		try {
			board = boardDao.selectBoardOne(board_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return board;
	}
	
	// 수정하기
	public int updateBoard(Board vo) {
		int result = 0;
		try {
			result = boardDao.updateBoard(vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// 삭제하기
	public int deleteBoard(Board option) {
		int result = 0;
		try {
			result = boardDao.deleteBoard(option);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
