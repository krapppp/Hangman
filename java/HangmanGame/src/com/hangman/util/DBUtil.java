package com.hangman.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // DB 정보 설정 (본인의 환경에 맞게 수정)
    private static final String URL = "jdbc:mysql://localhost:3306/hangman?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "본인의_비밀번호"; // 여기에 아까 설정한 비번 입력!

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // MySQL 드라이버 로드 및 연결
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("DB 연결 성공!");
        } catch (SQLException e) {
            System.out.println("DB 연결 실패: " + e.getMessage());
        }
        return conn;
    }
}