package co.yedam.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.mybatis.comm.Command;
import co.yedam.mybatis.notice.service.NoticeService;
import co.yedam.mybatis.notice.serviceImpl.NoticeServiceImpl;


public class NoticeList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		
		NoticeService noticeDao = new NoticeServiceImpl();
		
		request.setAttribute("notices", noticeDao.noticeSelectList());
		
		return "notice/noticeList";
	}

}
