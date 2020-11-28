package com.example.quora;

public class question {
    private String question;
    private String date;
    private String answers;

    public question(String question,String date,String answers){
        this.question=question;
        this.date=date;
        this.answers=answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
}
