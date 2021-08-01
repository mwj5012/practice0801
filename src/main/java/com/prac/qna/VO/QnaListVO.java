package com.prac.qna.VO;

import java.sql.Timestamp;

public class QnaListVO {

	private int qNum;				// qna 번호
	private String qTitle;			// 제목
	private String qContent;		// 내용
	private String qWriter;			// 작성자
	private Timestamp qRegDate;		// 작성일
	private int qViewCount;			// 조회수
	
	public int getqNum() {
		return qNum;
	}
	public void setqNum(int qNum) {
		this.qNum = qNum;
	}
	public String getqTitle() {
		return qTitle;
	}
	public void setqTitle(String qTitle) {
		this.qTitle = qTitle;
	}
	public String getqContent() {
		return qContent;
	}
	public void setqContent(String qContent) {
		this.qContent = qContent;
	}
	public String getqWriter() {
		return qWriter;
	}
	public void setqWriter(String qWriter) {
		this.qWriter = qWriter;
	}
	public Timestamp getqRegDate() {
		return qRegDate;
	}
	public void setqRegDate(Timestamp qRegDate) {
		this.qRegDate = qRegDate;
	}
	public int getqViewCount() {
		return qViewCount;
	}
	public void setqViewCount(int qViewCount) {
		this.qViewCount = qViewCount;
	}
	
}
