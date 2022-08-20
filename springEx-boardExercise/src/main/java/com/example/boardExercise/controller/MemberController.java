package com.example.boardExercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.boardExercise.model.member.CreateMemberForm;
import com.example.boardExercise.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/member")
public class MemberController {
	
	public final MemberService memberService;
	
	@GetMapping(path = "/join")
	public String joinForm(Model model) {
		model.addAttribute("createMemberForm", new CreateMemberForm());
		return "/member/joinForm";
	}
	
	@PostMapping(value = "/join")
	public String join(@ModelAttribute("createMemberForm")CreateMemberForm createMemberForm) {
		log.info("createMemberForm : {}", createMemberForm);
		memberService.saveMember(createMemberForm.toMember());
		return "redirect:/";
	}

}
