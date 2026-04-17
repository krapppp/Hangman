package com.hangman.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // 3306 뒤에 'hangman'은 어제 DBeaver에서 만든 데이터베이스 이름입니다.
    private static final String URL = "jdbc:mysql://localhost:3306/hangman?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "1234"; // 어제 설정한 비밀번호로 꼭 바꾸세요!

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // MySQL 드라이버 로딩 및 연결
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("연결 오류: " + e.getMessage());
        }
        return conn;
    }
}