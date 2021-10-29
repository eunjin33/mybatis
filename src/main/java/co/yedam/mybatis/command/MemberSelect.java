package co.yedam.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.mybatis.comm.Command;
import co.yedam.mybatis.member.service.MemberService;
import co.yedam.mybatis.member.service.MemberVO;
import co.yedam.mybatis.member.serviceImpl.MemberServiceImpl;

public class MemberSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId((String)session.getAttribute("id"));
				
		request.setAttribute("member", memberDao.memberSelect(vo));
		
		return "member/memberSelect";
	}

}
