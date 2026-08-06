package com.app.dto.study.request;

import lombok.Data;

@Data
public class Member {
	String id;
	String pw;
	String name;
	
	
	
	public Member(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
//+Getter Setter 추가
}