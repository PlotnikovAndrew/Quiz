package ru.otus.homeworks.hw2;

import java.util.Scanner;

import static ru.otus.homeworks.hw2.Counter.*;

public class Answer {

    static String[][] answerOptions = {
            {"Кавказкая пленница, или Новые приключения Шурика", "Человек с бульвара Капуцинов", "Бриллиантовая рука"},
            {"Доживем до понедельника", "Королева бензоколонки", "Покровские ворота"},
            {"Кин-дза-дза!", "Невероятные приключения итальянцев в России", "Гостья из будущего"}
    };
    static int[] correctAnswers = {1, 3, 3};

    static void showAnswers(int numberQuestion){
        for (int j = 0; j < answerOptions.length; j++) {
            System.out.println(j+1 + ". " + answerOptions[numberQuestion][j]);
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
    static void checkingAnswers(int response, int numberQuestion){

        if (response < 1 || response > answerOptions[numberQuestion].length) {
            System.out.println("Неверно! Правильный ответ: " + answerOptions[numberQuestion][correctAnswers[numberQuestion]-1]);
            addWrongCount();
            return;
        }
        System.out.println("Ваш ответ: " + answerOptions[numberQuestion][response-1]);
        if (response == correctAnswers[numberQuestion]){
            System.out.println("Верно!");
            addCorrectCount();
        } else {
            System.out.println("Неверно! Правильный ответ: " + answerOptions[numberQuestion][correctAnswers[numberQuestion]-1]);
            addWrongCount();
        }
    }
}


