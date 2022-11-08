package ru.otus.homeworks.hw2;

public class Counter {
    static int wrongCount = 0;
    static int correctCount = 0;

    static void addWrongCount() {
        wrongCount ++;
    }
    static void addCorrectCount() {
        correctCount ++;
    }
    static void showCount (){
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
