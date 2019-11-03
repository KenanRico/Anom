package com.forum.forum.Database.Service;

import java.time.LocalDate;
import java.util.List;

import com.forum.forum.Database.Model.Comment;

public interface DBService {

	List<Comment> FindAllComments();
	List<Comment> FindAllCommentByAuthor(String author);
	List<Comment> FindAllCommentsByDate(LocalDate date);
	void WriteComment(Comment comment);

}
