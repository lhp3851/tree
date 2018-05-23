/**   
* @Title: Course.java 
* @Package study.lhp.application.bean 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date May 15, 2018 2:33:03 PM 
* @version V1.0   
*/
package study.lhp.application.bean;

/** 
* @ClassName: Course 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date May 15, 2018 2:33:03 PM 
*  
*/

public class CourseModel {
	private String name;
	private String price;
	private String classProperty;
	private String teacher;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getClassProperty() {
		return classProperty;
	}
	public void setClassProperty(String classProperty) {
		this.classProperty = classProperty;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", price=" + price + ", classProperty=" + classProperty + ", teacher=" + teacher
				+ "]";
	}
	
}
