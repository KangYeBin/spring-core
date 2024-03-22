package com.spring.core.chap01;

import com.spring.core.config.HotelManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

	@Test
	void hotelTest() {
		Chef chef = new JohnChef();
		Course course = new WesternCourse();
		Restaurant restaurant = new WesternRestaurant(chef, course);
		Hotel hotel = new Hotel(restaurant, chef);
		hotel.reserve();

	}

}