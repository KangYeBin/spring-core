package com.spring.core.chap02;

import org.springframework.stereotype.Component;

@Component("jc")
public class JohnChef implements Chef {

	public void cook() {
		System.out.println("John 셰프가 서양요리를 합니다");
	}
}
