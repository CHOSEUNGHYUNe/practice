package com.example.boardExercise.model.member;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class CreateMemberForm {
	@Size(min = 4, max = 20)
	private String id;
	@Size(min = 4, max = 20)
	private String password;
	@Size(min = 2, max = 20)
	private String name;
	@NotNull
	private GenderType gender;
	@Past
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birth;
	private String email;
	
	public Member toMember() {
		Member member = new Member();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setGender(gender);
		member.setBirth(birth);
		member.setEmail(email);
		return member;
	}
}
