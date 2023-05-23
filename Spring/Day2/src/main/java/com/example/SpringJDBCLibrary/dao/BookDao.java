package com.example.SpringJDBCLibrary.dao;

import com.example.SpringJDBCLibrary.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Book> getAllBooks(){
        String stmt = "select * from book";
        List<Book> books = jdbcTemplate.query(stmt, new BookRowMapper());
        return books;
    }

    public Book getBookByISBN(String isbn){
        String sql = "select * from book where isbn =?";
        Book book = jdbcTemplate.queryForObject(sql,new BookRowMapper(), isbn);
        return book;
    }

    public void saveBook(Book newBook){
        String sql = "insert into book values(?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, newBook.getIsbn(), newBook.getTitle(), newBook.getAuthor(), newBook.getDescription(),
                newBook.getCategory_id(), newBook.getPub_Date(), newBook.getPublisher(), newBook.getAvailability());

    }

    private class BookRowMapper implements RowMapper<Book>{

        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            Book b = new Book();
            b.setIsbn(rs.getString(1));
            b.setTitle(rs.getString(2));
            b.setAuthor(rs.getString(3));
            b.setDescription(rs.getString("description"));
            b.setCategory_id(rs.getInt(5));
            b.setPub_Date(rs.getDate(6));
            b.setPublisher(rs.getString(7));
            b.setAvailability(rs.getString(8));
            return b;
        }
    }
}
