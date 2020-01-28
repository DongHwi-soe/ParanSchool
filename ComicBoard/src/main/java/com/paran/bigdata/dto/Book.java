package com.paran.bigdata.dto;

public class Book {
	
	private Integer board_ID;
	private String board_Genre;
	private String board_Title;
	private String board_Intro;
	private String board_Writer;
	private Integer board_CNT;
	private String board_YN;
	private String board_InsertUserID;
	private String board_InsertDate;
	private String board_UploadUserID;
	private String board_UploadDate;
	
	public Book(){
		
	}

	public Book(Integer id,String genre,
			String title, String intro, String writer,
			Integer cnt, String yn, String insertUserID,
			String insertDate, String uploadUserID, String uploadDate) {
		this.board_ID= id;
		this.board_Genre = genre;
		this.board_Title = title;
		this.board_Intro = intro;
		this.board_Writer = writer;
		this.board_CNT = cnt;
		this.board_YN = yn;
		this.board_InsertUserID = insertUserID;
		this.board_InsertDate = insertDate;
		this.board_UploadUserID = uploadUserID;
		this.board_UploadDate = uploadDate;
	}

	public Integer getBoard_ID() {
		return board_ID;
	}

	public void setBoard_ID(Integer board_ID) {
		this.board_ID = board_ID;
	}

	public String getBoard_Genre() {
		return board_Genre;
	}

	public void setBoard_Genre(String board_Genre) {
		this.board_Genre = board_Genre;
	}

	public String getBoard_Title() {
		return board_Title;
	}

	public void setBoard_Title(String board_Title) {
		this.board_Title = board_Title;
	}

	public String getBoard_Intro() {
		return board_Intro;
	}

	public void setBoard_Intro(String board_Intro) {
		this.board_Intro = board_Intro;
	}

	public String getBoard_Writer() {
		return board_Writer;
	}

	public void setBoard_Writer(String board_Writer) {
		this.board_Writer = board_Writer;
	}

	public Integer getBoard_CNT() {
		return board_CNT;
	}

	public void setBoard_CNT(Integer board_CNT) {
		this.board_CNT = board_CNT;
	}

	public String getBoard_YN() {
		return board_YN;
	}

	public void setBoard_YN(String board_YN) {
		this.board_YN = board_YN;
	}

	public String getBoard_InsertUserID() {
		return board_InsertUserID;
	}

	public void setBoard_InsertUserID(String board_InsertUserID) {
		this.board_InsertUserID = board_InsertUserID;
	}

	public String getBoard_InsertDate() {
		return board_InsertDate;
	}

	public void setBoard_InsertDate(String board_InsertDate) {
		this.board_InsertDate = board_InsertDate;
	}

	public String getBoard_UploadUserID() {
		return board_UploadUserID;
	}

	public void setBoard_UploadUserID(String board_UploadUserID) {
		this.board_UploadUserID = board_UploadUserID;
	}

	public String getBoard_UploadDate() {
		return board_UploadDate;
	}

	public void setBoard_UploadDate(String board_UploadDate) {
		this.board_UploadDate = board_UploadDate;
	}
	
}
