package com.forum.forum.Database.Model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name = "post")
public class Comment {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "MESSAGE")
	private String message;
	@Column(name = "POSTDATE")
	private LocalDate time;

	public Comment(){
	    //TODO
	}

	public void SetInfo(
	        String author,
			String message,
			LocalDate time
	){
		this.author = author;
		this.message = message;
		this.time = time;
	}

	public String Author(){ return author; }

	public String Message() { return message; }
}

