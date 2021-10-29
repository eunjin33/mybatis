package co.yedam.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.mybatis.comm.Command;
import co.yedam.mybatis.notice.service.NoticeService;
import co.yedam.mybatis.notice.service.NoticeVO;
import co.yedam.mybatis.notice.serviceImpl.NoticeServiceImpl;

public class NoticeDelete implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setNid(Integer.valueOf(request.getParameter("nid")));
		int n = noticeDao.noticeDelete(vo);
		System.out.println(n);
		String viewPage = null;
		if(n != 0) {
			viewPage = "noticeList.do";
		}else {
			request.setAttribute("message", "삭제 실패하였습니다");
			viewPage = "notice/noticeFail";
		}
		
		return viewPage;
	}

}
