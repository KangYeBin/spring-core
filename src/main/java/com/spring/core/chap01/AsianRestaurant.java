package com.spring.core.chap01;

public class AsianRestaurant implements Restaurant {

	private Chef chef;
	private Course course;

	public AsianRestaurant(Chef chef, Course course) {
		this.chef = chef;
		this.course = course;
	}

	public void order() {
		System.out.println("스시 오마카세를 주문합니다");
		course.combineMenu();
		chef.cook();
	}
}