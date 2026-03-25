package hibdemo.com.hyv;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	private String course;
	private String duration;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	

}
