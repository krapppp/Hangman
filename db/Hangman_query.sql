-- 1. hangman 데이터베이스(방)를 생성.
CREATE DATABASE IF NOT EXISTS hangman;

-- 2. 데이터베이스 사용 선언.
USE hangman;

-- 3. 테이블 생성.
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    score INT DEFAULT 0
);

CREATE TABLE words (
    id INT AUTO_INCREMENT PRIMARY KEY,
    word VARCHAR(100) NOT NULL,
    category VARCHAR(50) DEFAULT 'General'
);

-- 테스트용 단어 몇 개 집어넣기
INSERT INTO words (word, category) VALUES ('APPLE', 'Fruit');
INSERT INTO words (word, category) VALUES ('BANANA', 'Fruit');
INSERT INTO words (word, category) VALUES ('JAVA', 'Programming');
INSERT INTO words (word, category) VALUES ('ECLIPSE', 'Tool');
INSERT INTO words (word, category) VALUES ('COMPUTER', 'Tech');

-- 잘 들어갔는지 확인
SELECT * FROM words;