package com.hangman.dao;

import java.sql.*;
import com.hangman.util.DBUtil;
import com.hangman.dto.UserDTO;

public class UserDAO {

    // 1. 회원가입 (아이디 중복 체크 후 저장)
	// UserDAO.java 안에 추가
	public boolean register(String username, String password) {
	    // 1. SQL문 준비 (아이디, 비번 저장, 점수는 기본 0)
	    String sql = "INSERT INTO users (username, password, score) VALUES (?, ?, 0)";
	    
	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        
	        pstmt.setString(1, username);
	        pstmt.setString(2, password);
	        
	        int result = pstmt.executeUpdate(); // 실행 결과가 1이면 성공
	        return result > 0;
	        
	    } catch (SQLException e) {
	        // 이미 아이디가 존재할 경우 SQL 에러가 발생함
	        System.out.println("❌ 이미 존재하는 아이디입니다.");
	        return false;
	    }
	}

    // 2. 로그인 (아이디와 비번이 일치하는지 확인)
	// UserDAO.java 의 login 메서드 수정본
	public UserDTO login(String username, String password) {
	    String sql = "SELECT * FROM users WHERE username = ? AND password = ?"; // AND password 추가!
	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        
	        pstmt.setString(1, username);
	        pstmt.setString(2, password);
	        ResultSet rs = pstmt.executeQuery();
	        
	        if (rs.next()) {
	            return new UserDTO(rs.getString("username"), rs.getInt("score"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

    // (기존 updateScore 메서드는 그대로 유지)
    public void updateScore(String username, int earnedScore) {
        String sql = "UPDATE users SET score = score + ? WHERE username = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, earnedScore);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
            System.out.println("⭐ 점수가 반영되었습니다! (+" + earnedScore + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}