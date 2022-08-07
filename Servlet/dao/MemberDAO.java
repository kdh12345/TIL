package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.MemberDTO;

public class MemberDAO {
	//Member테이블 crud
	public int selectMember(String id, String userPassword) {
		Connection conn = null;
		int condition = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection
					("jdbc:mysql://127.0.0.1:3306/memberdb?serverTimezone=UTC", "emp2", "emp2");
			String sql ="select id, password from members where id=?";
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			ResultSet rs = pt.executeQuery();
			
			String resId = "";
			String pw = "";
			if(rs.next()) {
				condition = 1;
				resId     = rs.getString("id");
				pw        = rs.getString("password");
				
				// 비밀번호 체크
				if(userPassword.equals(pw)) {
					condition = 2;
				}
			}else {
				condition = 3;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {
				
			}
		}
		return condition;
	}

	public int insertMember(MemberDTO dto) {
		Connection conn = null;
		int rows = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection
					("jdbc:mysql://127.0.0.1:3306/memberdb?serverTimezone=UTC", "emp2", "emp2");
			
			String sql = "insert into members values(?,?,?,?,?,?)";
			PreparedStatement pt = conn.prepareStatement(sql);
			
			pt.setString(1, dto.getId());
			pt.setInt(2, dto.getPassword());
			pt.setString(3, dto.getName());
			pt.setString(4, dto.getPhone());
			pt.setString(5, dto.getEmail());
			pt.setString(6, dto.getRegDate());
			
			rows = pt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {
				
			}
		}
		return rows;
	}
}
