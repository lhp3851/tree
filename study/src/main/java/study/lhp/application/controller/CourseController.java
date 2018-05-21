/**   
* @Title: CourseController.java 
* @Package study.lhp.application.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date May 15, 2018 2:38:46 PM 
* @version V1.0   
*/
package study.lhp.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.lhp.application.bean.CourseModel;
import study.lhp.application.service.Bo.CourseServiceBo;

@RestController
@RequestMapping("/study")
public class CourseController {

	@Autowired
	private CourseServiceBo courseServiceBo;
	
	@RequestMapping("/course")
	public CourseModel getcourse() {
		CourseModel model = courseServiceBo.getCourse(); 
		return model;
	}
	
}
