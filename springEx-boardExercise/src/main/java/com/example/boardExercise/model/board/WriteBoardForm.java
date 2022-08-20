package com.example.boardExercise.model.board;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class WriteBoardForm {
	@NotBlank
	private String title;
	@NotBlank
	private String content;
}
