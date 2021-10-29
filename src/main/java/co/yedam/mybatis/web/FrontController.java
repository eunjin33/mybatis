package co.yedam.mybatis.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.mybatis.comm.Command;
import co.yedam.mybatis.command.HomeCommand;
import co.yedam.mybatis.command.MemberJoin;
import co.yedam.mybatis.command.MemberJoinForm;
import co.yedam.mybatis.command.MemberList;
import co.yedam.mybatis.command.MemberLogin;
import co.yedam.mybatis.command.MemberLoginForm;
import co.yedam.mybatis.command.MemberLogout;
import co.yedam.mybatis.command.MemberSelect;
import co.yedam.mybatis.command.NoticeDelete;
import co.yedam.mybatis.command.NoticeForm;
import co.yedam.mybatis.command.NoticeInsert;
import co.yedam.mybatis.command.NoticeList;
import co.yedam.mybatis.command.NoticeSelect;
import co.yedam.mybatis.command.NoticeUpdate;
import co.yedam.mybatis.command.NoticeUpdateForm;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
    
    public FrontController() {
        super();
       
    }

	public void init(ServletConfig config) throws ServletException {
		map.put("/home.do", new HomeCommand());
		map.put("/memberLoginForm.do", new MemberLoginForm()); //로그인 폼 
		map.put("/memberLogin.do", new MemberLogin()); //로그인 처리
		map.put("/memberJoinForm.do", new MemberJoinForm()); //회원가입 폼
		map.put("/memberJoin.do", new MemberJoin()); //회원가입 처리
		map.put("/memberList.do", new MemberList()); //멤버리스트(관리자 열람)
		//멤버 리스트 수정,삭제(관리자만 가능)
		map.put("/memberSelect.do", new MemberSelect()); //회원조회(로그인한 회원의 정보 조회)
		map.put("/memberLogout.do", new MemberLogout()); //로그아웃 처리 
		
		map.put("/noticeList.do", new NoticeList()); //게시판 리스트
		map.put("/noticeSelect.do", new NoticeSelect()); //게시판 세부내역
		map.put("/noticeForm.do", new NoticeForm()); //게시판 글쓰기 폼
		map.put("/noticeInsert.do", new NoticeInsert()); //게시판 글 등록 처리
		map.put("/noticeDelete.do", new NoticeDelete()); //게시판 글 삭제 처리
		map.put("/noticeUpdateForm.do", new NoticeUpdateForm()); //게시판 수정 폼
		map.put("/noticeUpdate.do", new NoticeUpdate()); //게시판 글 수정 처리
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		Command command = map.get(page);
		String viewPage = command.run(request, response);
		
		
		if(!viewPage.endsWith(".do")) {
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}
