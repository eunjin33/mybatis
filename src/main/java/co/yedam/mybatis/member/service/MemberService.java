package co.yedam.mybatis.member.service;

import java.util.List;

public interface MemberService { //Model에서 사용(dao)
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);

}
