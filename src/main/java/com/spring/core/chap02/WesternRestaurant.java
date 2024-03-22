package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wr")
public class WesternRestaurant implements Restaurant {

	// 의존 객체
	private Chef chef;
	private Course course = new WesternCourse();

	@Autowired
	public WesternRestaurant(@Qualifier("jc") Chef chef,
							 @Qualifier("wc") Course course) {
		this.chef = chef;
		this.course = course;
	}

	// 요리를 주문하는 기능
	public void order() {
		System.out.println("서양 요리를 주문합니다");
		// 요리 코스 메뉴를 구성해야한다
		course.combineMenu();
		// 요리사에게 요리 명령을 내려야한다
		chef.cook();
	}
	
}
