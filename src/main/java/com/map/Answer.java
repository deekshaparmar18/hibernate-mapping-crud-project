package com.map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int ansid;
	//@OneToOne(mappedBy="answer")
	@ManyToOne
	private Question q;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int ansid, String answer) {
		super();
		this.ansid = ansid;
		this.answer = answer;
	}
	private String answer;
	public int getAnsid() {
		return ansid;
	}
	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQ() {
		return q;
	}
	public void setQ(Question q) {
		this.q = q;
	}
	
	

}
