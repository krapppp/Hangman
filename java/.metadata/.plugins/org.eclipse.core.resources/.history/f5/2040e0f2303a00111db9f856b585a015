package com.hangman.main;

import com.hangman.dao.WordDAO;
import com.hangman.dto.WordDTO;

public class TestMain {
    public static void main(String[] args) {
        WordDAO dao = new WordDAO();
        WordDTO word = dao.getRandomWord();
        
        if (word != null) {
            System.out.println("DB에서 가져온 단어: " + word.getWord());
            System.out.println("카테고리: " + word.getCategory());
        } else {
            System.out.println("단어를 가져오지 못했습니다. DB에 데이터가 있는지 확인하세요!");
        }
    }
}