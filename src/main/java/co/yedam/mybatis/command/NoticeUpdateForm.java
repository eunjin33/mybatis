package co.yedam.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.mybatis.comm.Command;
import co.yedam.mybatis.notice.service.NoticeService;
import co.yedam.mybatis.notice.service.NoticeVO;
import co.yedam.mybatis.notice.serviceImpl.NoticeServiceImpl;

public class NoticeUpdateForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {

		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		
		vo.setNid(Integer.valueOf(request.getParameter("nid")));
		vo = noticeDao.noticeSelect(vo);
		request.setAttribute("notice", vo);

		return "notice/noticeUpdateForm";
	}

}
