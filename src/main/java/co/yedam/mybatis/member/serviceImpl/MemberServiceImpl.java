package co.yedam.mybatis.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.mybatis.comm.DataSource;
import co.yedam.mybatis.member.service.MemberMapper;
import co.yedam.mybatis.member.service.MemberService;
import co.yedam.mybatis.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	
	@Override
	public List<MemberVO> memberSelectList() {
		
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
	
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		
		return map.memberDelete(vo);
	}

}
