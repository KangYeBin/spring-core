package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ar")
public class AsianRestaurant implements Restaurant {

	private Chef chef;
	private Course course;

	@Autowired
	public AsianRestaurant(@Qualifier("kc") Chef chef,
						   @Qualifier("sc") Course course) {
		this.chef = chef;
		this.course = course;
	}

	public void order() {
		System.out.println("스시 오마카세를 주문합니다");
		course.combineMenu();
		chef.cook();
	}
}
