/**   
* @Title: CourseServiceBoImpl.java 
* @Package study.lhp.application.service.BoImpl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date May 15, 2018 2:47:51 PM 
* @version V1.0   
*/
package study.lhp.application.service.BoImpl;

import org.springframework.stereotype.Service;

import study.lhp.application.bean.CourseModel;
import study.lhp.application.service.Bo.CourseServiceBo;

/** 
* @ClassName: CourseServiceBoImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date May 15, 2018 2:47:51 PM 
*  
*/
@Service
public class CourseServiceBoImpl implements CourseServiceBo {

	/* (non-Javadoc)
	 * @see study.lhp.application.service.Bo.CourseServiceBo#getCourse()
	 */
	@Override
	public CourseModel getCourse() {
		CourseModel model = new CourseModel();
		model.setName("课程名字");
		model.setPrice("课程价格");
		model.setClassProperty("课程类别");
		model.setTeacher("任课老师");
		return model;
	}

}
