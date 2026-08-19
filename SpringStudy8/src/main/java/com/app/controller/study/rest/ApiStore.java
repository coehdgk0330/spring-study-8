package com.app.controller.study.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiStore {
	
	String name; // 가게이름
	String address; // 주소
	String tel; //전화번호
	
}
