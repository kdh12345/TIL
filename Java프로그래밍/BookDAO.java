package javaExam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDAO {

	public void insertBook(BookDTO dto) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/memberdb?serverTimezone=UTC"
					, "emp2", "emp2");
			
			String sql = "insert into book values(?, ?, ?, str_to_date(?,'%Y'), ?, ?)";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1, dto.getBookNo());
			pt.setString(2, dto.getBookTitle());
			pt.setString(3, dto.getBookAuthor());
			pt.setString(4, dto.getBookYear());
			pt.setInt(5, dto.getBookPrice());
			pt.setString(6, dto.getBookPublisher());
			
			int rows = pt.executeUpdate();
			System.out.println(rows+"!!!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				
			}
		}
	}

	public void selectBook() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/memberdb?serverTimezone=UTC"
					, "emp2", "emp2");
			
			String sql = "select bookNo, bookTitle, bookAuthor, date_format(bookYear,'%Y') as 'bookYear', bookPrice, bookPublisher from book";
			PreparedStatement pt = con.prepareStatement(sql);
			
			
			ResultSet rs = pt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("bookNo")+" "+rs.getString("bookTitle")+" "+rs.getString("bookAuthor")+" "+rs.getString("bookYear")+" "+rs.getInt("bookPrice")+" "+rs.getString("bookPublisher"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				
			}
		}
	}

}
