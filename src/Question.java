package ru.otus.homeworks.hw2;


public class Question {
    private static final String PREFACE_QUESTION = "Из какого фильма эта цитата?: ";
    private String question;
    private int correctAnswer;
    private String[] answers;

    public Question(String question, String[] answer, int correctAnswer) {
        this.question = question;
        this.answers = answer;
        this.correctAnswer = correctAnswer;
    }

    void showQuestion() {
        System.out.println(PREFACE_QUESTION + this.question);
    }
}
