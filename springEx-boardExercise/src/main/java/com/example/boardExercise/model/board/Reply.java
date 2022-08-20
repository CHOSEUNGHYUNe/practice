package com.example.boardExercise.model.board;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Reply {
	private long id;
	private String content;
	private String member_id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime inputTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime updateTime;
}
