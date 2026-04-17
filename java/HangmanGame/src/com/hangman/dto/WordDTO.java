package com.hangman.dto;

public class WordDTO {
    private int id;
    private String word;
    private String category;

    // 기본 생성자
    public WordDTO() {}

    // Getter와 Setter (이클립스 상단 Source -> Generate Getters and Setters로 만들면 편해요!)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getWord() { return word; }
    public void setWord(String word) { this.word = word; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}