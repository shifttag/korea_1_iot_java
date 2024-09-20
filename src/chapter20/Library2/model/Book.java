package chapter20.Library2.model;

import lombok.Data;

@Data
public class Book {
	private String title;
	private String author;
	private Boolean isBorrowed;	// 책의 대여 상태를 나타내는 필드(false - 미대여)
	
	// 생성자
	public Book(String title, String author, Boolean isBorrowed) {
		this.title = title;
		this.author = author;
		this.isBorrowed = isBorrowed;
	}
	
	/*
	lombok에 @Data로 대체 가능
	// Getters
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public Boolean getIsBorrowed() {
		return isBorrowed;
	}
	
	// Setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setTtitle(Boolean isBorrwed) {
		this.isBorrowed = isBorrowed;
	}
	*/
}
