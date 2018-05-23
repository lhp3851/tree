package study;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import study.lhp.application.bean.CourseModel;
import study.lhp.application.controller.CourseController;

class CourseControllerTest {

	private static CourseController courseController = new CourseController();
	
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testGetcourse() {
		 CourseModel model = courseController.getcourse();
//		 System.out.println(model.getName());
	}

	@Test
	void testGreeting() {
		assertEquals("greetings", "greetings");
	}

}
