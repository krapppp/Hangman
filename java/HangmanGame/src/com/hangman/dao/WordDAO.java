package com.hangman.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hangman.dto.WordDTO;
import com.hangman.util.DBUtil;

public class WordDAO {
    
    // DB에서 랜덤으로 단어 하나를 가져오는 메서드
    public WordDTO getRandomWord() {
        String sql = "SELECT * FROM words ORDER BY RAND() LIMIT 1";
        
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            if (rs.next()) {
                WordDTO dto = new WordDTO();
                dto.setId(rs.getInt("id"));
                dto.setWord(rs.getString("word"));
                dto.setCategory(rs.getString("category"));
                return dto;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}