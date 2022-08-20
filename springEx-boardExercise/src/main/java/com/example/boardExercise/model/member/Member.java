package com.example.boardExercise.model.member;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String password;
	private String name;
	private GenderType gender;
	private LocalDate birth;
	private String email;

}
