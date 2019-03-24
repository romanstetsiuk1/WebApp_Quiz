package com.romanstetsiuk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue
    private long id;

    String quizType;

    List<Question> questions;

    public Quiz(String quizType, List<Question> questions) {
        this.quizType = quizType;
        this.questions = questions;
    }

    public Quiz() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuizType() {
        return quizType;
    }

    public void setQuizType(String quizType) {
        this.quizType = quizType;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", quizType='" + quizType + '\'' +
                ", questions=" + questions +
                '}';
    }
}
