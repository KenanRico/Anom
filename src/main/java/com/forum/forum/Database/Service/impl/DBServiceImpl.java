package com.forum.forum.Database.Service.impl;

import java.time.LocalDate;
import java.util.List;

import com.forum.forum.Database.Model.Comment;
import com.forum.forum.Database.Repository.CommentRepository;
import org.hibernate.exception.SQLGrammarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.forum.Database.Model.Comment;
import com.forum.forum.Database.Repository.CommentRepository;
import com.forum.forum.Database.Service.DBService;
import lombok.extern.log4j.Log4j2;


@Log4j2
@Service
public class DBServiceImpl implements DBService {
	@Autowired
	CommentRepository cr;


	@Override
	public List<Comment> FindAllComments() throws NullPointerException{
		return cr.FindAll();
	}

	@Override
	public List<Comment> FindAllCommentByAuthor(String author)  throws NullPointerException{
		return cr.FindAllByAuthor(author);
	}

	@Override
	public List<Comment> FindAllCommentsByDate(LocalDate date) throws NullPointerException{
		return cr.FindAllByDate(date);
	}

	@Override
	public void WriteComment(Comment comment) throws NullPointerException, SQLGrammarException {
		cr.save(comment);
	}

}
