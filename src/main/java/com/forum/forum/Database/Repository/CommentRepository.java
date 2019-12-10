package com.forum.forum.Database.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.forum.forum.Database.Model.Comment;

import java.time.LocalDate;
import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

    /*
     * Write message
     */
    public static final String SQL_WRITE_COMMENT = "INSERT INTO `post` (AUTHOR, MESSAGE, POSTDATE) VALUES (:NAME, :COMMENT, :TIME)";
    @Query(value = SQL_WRITE_COMMENT, nativeQuery = true)
    void Write(@Param("NAME") String author, @Param("COMMENT") String comment, @Param("TIME") LocalDate date);

	/*
	 * Select all
	 */
    public static final String SQL_SELECT_ALL_COMMENTS = "SELECT * FROM post";
    @Query(value = SQL_SELECT_ALL_COMMENTS, nativeQuery = true)
    List<Comment> FindAll();

    /*
     * Select by author
     */
    public static final String SQL_SELECT_BY_AUTHOR = "SELECT * FROM post WHERE AUTHOR=:NAME";
    @Query(value = SQL_SELECT_BY_AUTHOR, nativeQuery = true)
    List<Comment> FindAllByAuthor(@Param("NAME") String author);

    /*
     * Select by date
     */
    public static final String SQL_SELECT_BY_DATE = "SELECT * FROM post WHERE POSTDATE=:TIME";
    @Query(value = SQL_SELECT_BY_DATE, nativeQuery = true)
    List<Comment> FindAllByDate(@Param("TIME") LocalDate date);

}

