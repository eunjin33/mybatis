package co.yedam.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.mybatis.comm.Command;
import co.yedam.mybatis.member.service.MemberService;
import co.yedam.mybatis.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//DB에서 가서 가지고 온다 
		MemberService memberdao = new MemberServiceImpl();

		request.setAttribute("members", memberdao.memberSelectList());

		return "member/memberList";
	}

}
