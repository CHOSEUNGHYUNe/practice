package com.example.boardExercise.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.boardExercise.model.board.Board;
import com.example.boardExercise.repository.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardService {

	public final BoardMapper boardMapper;
	
	public void saveBoard(Board board) {
		boardMapper.saveBoard(board);
	}
	public List<Board> findAllBoards() {
		List<Board> boards = boardMapper.findAllBoards();
		if(boards == null || boards.size() == 0) {
			return null;
		}
		return boards;
	}
	
	public Board findBoard(long id) {
		Board findBoard = boardMapper.findBoardById(id);
		return findBoard;
	}
	
	public Board readBoard(long id) {
		Board findBoard = boardMapper.findBoardById(id);
		findBoard.addHit();
		boardMapper.updateBoard(findBoard);
		return findBoard;
	}
	
	public void updateBoard(Board board) {
		boardMapper.updateBoard(board);
	}
	public void removeBoard(long id) {
		boardMapper.removeBoard(id);
	}
}
