package com.example.boardExercise.repository;

import org.apache.ibatis.annotations.Mapper;	

import com.example.boardExercise.model.member.Member;

@Mapper
public interface MemberMapper {
	public int saveMember(Member member);
	public Member findMemberById(String id);
	public Member findMemberByIdAndPassword(Member member);
	public int updateMember(Member member);
}
