package co.yedam.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.mybatis.comm.Command;
import co.yedam.mybatis.member.service.MemberService;
import co.yedam.mybatis.member.service.MemberVO;
import co.yedam.mybatis.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		//vo.setId(session.getAttribute("id")); 세션이 존재하면 세션 값을 가지고 온다.
		vo.setId(request.getParameter("id"));

		vo.setPassword(request.getParameter("password"));
		vo = memberDao.memberSelect(vo);
		//request.setAttribute("member", vo);  //request 객체에 실어주는 거 
		
		//값을 실어서 보냈지만 검색했는데 결과가 없으면 비어있는 vo를 전달해줌 if(아이디랑 패스워드가 널이 아니면) 
		if(vo != null) {
			request.setAttribute("message", vo.getName()+"님 환영합니다");
			session.setAttribute("id", vo.getId());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("name", vo.getName());
		}else {
			request.setAttribute("message", "아이디 또는 패스워드가 틀렸습니다");
		}
		return "member/memberLogin";
	}

}
