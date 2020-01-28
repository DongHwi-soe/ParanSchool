package com.paran.bigdata.dao;


import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.paran.bigdata.dto.Book;

@Repository
public class BookRestDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Book> rowMapper 
	= BeanPropertyRowMapper.newInstance(Book.class);
	
	private static final String SELECT_ALL =
			"SELECT board_ID, board_Genre, board_Title, board_Intro, board_Writer,"
			+ " board_CNT, board_InsertUserID, board_InsertDate, "
			+ "board_UploadUserID, board_UploadDate FROM Board";
	private static final String DELETE_BY_ID = 
			"DELETE FROM Board WHERE board_ID= :id";
	
	public BookRestDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
				.withTableName("book")
				.usingGeneratedKeyColumns("id");
	}
	
	public List<Book> selectAll() {
		Map<String, Object> params = Collections.emptyMap();
		return jdbc.query(SELECT_ALL, params, rowMapper);
	}
	
	public int deleteById(Integer id) {
		Map<String, ?> params = Collections.singletonMap("id", id);
		return jdbc.update(DELETE_BY_ID, params);
	}
	
	public Integer insert(Book book) {
		SqlParameterSource params = 
				new BeanPropertySqlParameterSource(book);
		return insertAction.executeAndReturnKey(params).intValue();
	}
}
