package co.yedam.mybatis.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.mybatis.comm.Command;
import co.yedam.mybatis.notice.service.NoticeService;
import co.yedam.mybatis.notice.service.NoticeVO;
import co.yedam.mybatis.notice.serviceImpl.NoticeServiceImpl;

public class NoticeInsert implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		
		//vo.setId(request.getParameter("id"));
		//vo.setName(request.getParameter("name"));
		
		vo.setId(String.valueOf(session.getAttribute("id")));
		vo.setName(String.valueOf(session.getAttribute("name")));
		vo.setWriteDate(Date.valueOf(request.getParameter("writeDate")));
		vo.setTitle(request.getParameter("title"));
		vo.setContents(request.getParameter("contents"));
		
		int n = noticeDao.noticeInsert(vo);
		String viewPage = null;
		
		if(n != 0 ) {
			viewPage = "noticeList.do";
			
		}else {
			request.setAttribute("message", "등록에 실패하였습니다");
			viewPage = "notice/noticeFail";
		}
		
		return viewPage;
	}

}
