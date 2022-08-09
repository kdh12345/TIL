package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.MemberDTO;

public class MemberDAO {
	//Member테이블 crud
	public int selectMember(String id, String userPassword) {
		Connection conn = null;
		int condition = 0;
		try {
			//1. context.xml 파일 정의 내용 읽어올 준비
			Context initContext = new InitialContext();
			
			//2. <Resource 이름 태그 설정 읽어오기
			Context envContext = (Context)initContext.lookup("java:/comp/env"); // java - component - environment 파일
			
			//3. jdbc/mydb 설정 태그만 읽어오기 connection pooling 클래스 객체 생성
			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
			
			conn = ds.getConnection();
			
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
			//1. context.xml 파일 정의 내용 읽어올 준비
			Context initContext = new InitialContext();
			
			//2. <Resource 이름 태그 설정 읽어오기
			Context envContext = (Context)initContext.lookup("java:/comp/env"); // java - component - environment 파일
			
			//3. jdbc/mydb 설정 태그만 읽어오기 connection pooling 클래스 객체 생성
			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
			
			conn = ds.getConnection();
			
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

	public ArrayList<MemberDTO> selectAllMember() {
		ArrayList<MemberDTO> dtos = new ArrayList<>();
		Connection conn = null;
		try {
			//1. context.xml 파일 정의 내용 읽어올 준비
			Context initContext = new InitialContext();
			
			//2. <Resource 이름 태그 설정 읽어오기
			Context envContext = (Context)initContext.lookup("java:/comp/env"); // java - component - environment 파일
			
			//3. jdbc/mydb 설정 태그만 읽어오기 connection pooling 클래스 객체 생성
			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
			
			conn = ds.getConnection();
			
			String sql = "select * from members";
			PreparedStatement pt = conn.prepareStatement(sql);
			ResultSet rs = pt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				//dto.setPassword(rs.getInt("password"));
				dto.setName(rs.getString("name"));
				dto.setPhone(rs.getString("phone"));
				dto.setEmail(rs.getString("email"));
				dto.setRegDate(rs.getString("regdate"));
				dtos.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {}
		}
		return dtos;
	}
	
	public int deleteMember(String id) {
		Connection conn = null;
		int rows = 0;
		try {
			//1. context.xml 파일 정의 내용 읽어올 준비
			Context initContext = new InitialContext();
			
			//2. <Resource 이름 태그 설정 읽어오기
			Context envContext = (Context)initContext.lookup("java:/comp/env"); // java - component - environment 파일
			
			//3. jdbc/mydb 설정 태그만 읽어오기 connection pooling 클래스 객체 생성
			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
			
			conn = ds.getConnection();
			
			String sql = "delete from members where id=?";
			PreparedStatement pt = conn.prepareStatement(sql);
			
			pt.setString(1, id);
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
	
	public int updateMember(MemberDTO dto) {
		Connection conn = null;
		int rows = 0;
		try {
			//1. context.xml 파일 정의 내용 읽어올 준비
			Context initContext = new InitialContext();
			
			//2. <Resource 이름 태그 설정 읽어오기
			Context envContext = (Context)initContext.lookup("java:/comp/env"); // java - component - environment 파일
			
			//3. jdbc/mydb 설정 태그만 읽어오기 connection pooling 클래스 객체 생성
			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
			
			conn = ds.getConnection();
			
			String sql = "update members set id=?, password=?, name=?, phone=?, email=? where id=?";
			PreparedStatement pt = conn.prepareStatement(sql);
			
			pt.setString(1, dto.getId());
			pt.setInt(2, dto.getPassword());
			pt.setString(3, dto.getName());
			pt.setString(4, dto.getPhone());
			pt.setString(5, dto.getEmail());
			pt.setString(6, dto.getId());
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
	
	public MemberDTO SelectMember2(String id) {
		Connection conn = null;
		MemberDTO dto = new MemberDTO();
		try {
			//1. context.xml 파일 정의 내용 읽어올 준비
			Context initContext = new InitialContext();
			
			//2. <Resource 이름 태그 설정 읽어오기
			Context envContext = (Context)initContext.lookup("java:/comp/env"); // java - component - environment 파일
			
			//3. jdbc/mydb 설정 태그만 읽어오기 connection pooling 클래스 객체 생성
			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
			
			conn = ds.getConnection();
			
			String sql ="select * from members where id=?";
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			ResultSet rs = pt.executeQuery();
			
			String resId = "";
			String pw = "";
			String name = "";
			String phone = "";
			String email = "";
			if(rs.next()) {
				resId     = rs.getString("id");
				pw        = rs.getString("password");
				name      = rs.getString("name");
				phone     = rs.getString("phone");
				email     = rs.getString("email");
				dto.setId(resId);
				dto.setPassword(Integer.parseInt(pw));
				dto.setName(name);
				dto.setPhone(phone);
				dto.setEmail(email);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {
				
			}
		}
		return dto;
	}
}
