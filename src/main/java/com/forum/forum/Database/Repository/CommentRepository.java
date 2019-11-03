package com.forum.forum.Database.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.forum.forum.Database.Model.Comment;

import java.time.LocalDate;
import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

	/*
	public static final String SQL_CHECK_USER_PASSWORD = "SELECT * FROM POST WHERE AUTHOR=:NAME AND PASSWORD= :PASS";
	List<Comment> findByName(String author);
	@Query(value = SQL_CHECK_USER_PASSWORD, nativeQuery = true)
	Customer FindByUsernamePassword(@Param("NAME") String name, @Param("PASS") String pass);
	*/

	/*
	 * Select all
	 */
    public static final String SQL_SELECT_ALL_COMMENTS = "SELECT * FROM POST";
    @Query(value = SQL_SELECT_ALL_COMMENTS, nativeQuery = true)
    List<Comment> FindAll();

    /*
     * Select by author
     */
    public static final String SQL_SELECT_BY_AUTHOR = "SELECT * FROM POST WHERE AUTHOR=:NAME";
    @Query(value = SQL_SELECT_BY_AUTHOR, nativeQuery = true)
    List<Comment> FindAllByAuthor(@Param("NAME") String author);

    /*
     * Select by date
     */
    public static final String SQL_SELECT_BY_DATE = "SELECT * FROM POST WHERE POSTDATE=:TIME";
    @Query(value = SQL_SELECT_BY_AUTHOR, nativeQuery = true)
    List<Comment> FindAllByDate(@Param("TIME") LocalDate date);

}

