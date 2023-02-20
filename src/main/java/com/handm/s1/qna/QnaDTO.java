package com.handm.s1.qna;

import java.sql.Date;

public class QnaDTO {
	private Long boardNum;
	private String boardTitle;
	private String boardContents;
	private Date boardDate;
	
	
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	private Long boardTotal;
	private String boardWriter;
	
	
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	
	public Long getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Long boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}

	/*
	 * public String getBoardDate() { return boardDate; } public void
	 * setBoardDate(String boardDate) { this.boardDate = boardDate; }
	 */
	public Long getBoardTotal() {
		return boardTotal;
	}
	public void setBoardTotal(Long boardTotal) {
		this.boardTotal = boardTotal;
	}



}
