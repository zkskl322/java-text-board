package org.example;

public class Article {
    private int id; // 번호
    private String title; // 제목

    private String body; // 내용

    private String regDate; // 등록날짜

    public Article() {
    }

    public Article(int id, String title, String body, String regDate) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.regDate = regDate;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
