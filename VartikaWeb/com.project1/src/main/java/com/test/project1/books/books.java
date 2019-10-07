package com.test.project1.books;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Books")
public class books {

	@Id
	private int id;
	private String bookname;
	private double borice;

	public int getBookid() {
		return id;
	}

	public void setBookid(int bookid) {
		this.id = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public double getBookprice() {
		return borice;
	}

	public void setBookprice(double bookprice) {
		this.borice = bookprice;
	}
	@Override
	public String toString() {
		return "books [bookid=" + id + ", bookname=" + bookname + ", bookprice=" + borice + "]";
	}

}
