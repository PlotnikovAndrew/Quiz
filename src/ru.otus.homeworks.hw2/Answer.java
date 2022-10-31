package ru.otus.homeworks.hw2.ru.otus.homeworks.hw2;

public class Answer {

    static String[][] answerOptions = {
            {"Кавказкая пленница, или Новые приключения Шурика", "Человек с бульвара Капуцинов", "Бриллиантовая рука"},
            {"Доживем до понедельника", "Королева бензоколонки", "Покровские ворота"},
            {"Кин-дза-дза!", "Невероятные приключения итальянцев в России", "Гостья из будущего"}
    };
    int[] correctAnswers = {1, 3, 3};

    static void showAnswers(int i){
        for (int j = 0; j < answerOptions.length; j++) {
            System.out.println(j+1 + ". " + answerOptions[i][j]);
        }
    }
}


