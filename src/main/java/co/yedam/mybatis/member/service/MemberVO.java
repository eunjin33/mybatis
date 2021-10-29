package co.yedam.mybatis.member.service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberVO {
	//VO의 기본은 테이블이지만 
	private String id;
	private String password;
	private String name;
	private String address;
	private String tel;
	private String author;
}
