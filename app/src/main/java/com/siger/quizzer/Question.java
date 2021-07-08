package com.siger.quizzer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question {
    public String text;
    private Set<String> answers;
    private String validAnswer;

    public Question() {

    }

    public boolean validate(String answer) {
        return answer.equals(this.validAnswer);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswers(Set<String> answers) {
        this.answers = answers;
    }

    public void setValidAnswer(String validAnswer) {
        this.validAnswer = validAnswer;
    }

    public String getText() {
        return this.text;
    }

    public Set<String> getAnswers() {
        return new HashSet<String>(this.answers);
    }

}
