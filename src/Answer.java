package ru.otus.homeworks.hw2;

import java.util.Scanner;

import static ru.otus.homeworks.hw2.Counter.*;

public class Answer {

    static void showAnswers(String[] answers){
        for (int i = 0; i < answers.length; i++){
            System.out.println((i+1)+ ") " + answers[i]);
        }
    }

    static int acceptAnswers(){
        Scanner scanner = new Scanner(System.in);
        String responseFromTheConsoleString = scanner.next();
        try {
            return Integer.parseInt(responseFromTheConsoleString);
        }
        catch (NumberFormatException name){
            return -1;
        }
    }

    static void checkingAnswers(int response, String[] answers, String correctAnswersString, int correctAnswersInt){

        if (response < 1 || response > answers.length) {
            System.out.println("Неверно! Правильный ответ: " + correctAnswersString);
            addWrongCount();
            return;
        }
        if (response == correctAnswersInt){
            System.out.println("Верно!");
            addCorrectCount();
        } else {
            System.out.println("Неверно! Правильный ответ: " + correctAnswersString);
            addWrongCount();
        }
    }
}
