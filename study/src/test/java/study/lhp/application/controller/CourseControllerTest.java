package study.lhp.application.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import study.lhp.application.bean.CourseModel;

class CourseControllerTest extends TestCase {
	private static CourseController controller = new CourseController();
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Test
	public void test() {
		CourseController controller = new CourseController();
		controller.getcourse();
	}

	@Test
	public CourseModel testGetCourse() {
		return controller.getcourse();
	}
}
