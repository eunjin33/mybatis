package co.yedam.mybatis.notice.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.mybatis.comm.DataSource;
import co.yedam.mybatis.notice.service.NoticeMapper;
import co.yedam.mybatis.notice.service.NoticeService;
import co.yedam.mybatis.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private NoticeMapper map = sqlSession.getMapper(NoticeMapper.class);
	
	@Override
	public List<NoticeVO> noticeSelectList() {
		
		return map.noticeSelectList();
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
	
		return map.noticeDelete(vo);
		
		
	}

	@Override
	public int hitUpdate(NoticeVO vo) {
	
		return map.hitUpdate(vo);
	}

}
