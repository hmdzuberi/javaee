package com.training.entity;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

@Component
public class Book {

	@NotNull
	@Max(value = 1000, message = "Max value should be 1000")
	@Min(value = 10, message = "Min value should be 10")
	private long bookNo;

	private String bookName;
	private String author;
	private String category;

	@Past
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dateOfPublish;

	private double ratePerUnit;

	public Book() {

		super();
	}

	public Book(long bookNo, String bookName, String author, String category, LocalDate dateOfPublish,
			double ratePerUnit) {

		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
		this.category = category;
		this.dateOfPublish = dateOfPublish;
		this.ratePerUnit = ratePerUnit;
	}

	public long getBookNo() {

		return bookNo;
	}

	public void setBookNo(long bookNo) {

		this.bookNo = bookNo;
	}

	public String getBookName() {

		return bookName;
	}

	public void setBookName(String bookName) {

		this.bookName = bookName;
	}

	public String getAuthor() {

		return author;
	}

	public void setAuthor(String author) {

		this.author = author;
	}

	public String getCategory() {

		return category;
	}

	public void setCategory(String category) {

		this.category = category;
	}

	public LocalDate getDateOfPublish() {

		return dateOfPublish;
	}

	public void setDateOfPublish(LocalDate dateOfPublish) {

		this.dateOfPublish = dateOfPublish;
	}

	public double getRatePerUnit() {

		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {

		this.ratePerUnit = ratePerUnit;
	}

	@Override
	public String toString() {

		return "Book [bookNo=" + bookNo + ", bookName=" + bookName + ", author=" + author + ", category=" + category
				+ ", dateOfPublish=" + dateOfPublish + ", ratePerUnit=" + ratePerUnit + "]";
	}

}
