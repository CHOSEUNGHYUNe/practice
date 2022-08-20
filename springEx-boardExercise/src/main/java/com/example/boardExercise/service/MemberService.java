package com.example.boardExercise.service;

import org.springframework.stereotype.Service;

import com.example.boardExercise.model.member.Member;
import com.example.boardExercise.repository.MemberMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {

	private final MemberMapper memberMapper;
	
	public void saveMember(Member member) {
		memberMapper.saveMember(member);
	}
	public Member findMember(String id) {
		return memberMapper.findMemberById(id);
	}
		
	public Member findMember(Member member) {
		return memberMapper.findMemberByIdAndPassword(member);
	}
	public void updateMember(Member member) {
		memberMapper.updateMember(member);
	}
}
