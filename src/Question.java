package ru.otus.homeworks.hw2;

import static ru.otus.homeworks.hw2.Answer.*;
import static ru.otus.homeworks.hw2.Counter.showCount;

public class Question {
    private static final String PREFACE_QUESTION = "Из какого фильма эта цитата?: ";
    static String[] questions = {"Идите, идите. Мы Вас вылечим. Алкоголики - это наш профиль.",
            "Ну, юноша, самовыражайтесь быстрее",
            "Да я же говорю - я за кефиром пошёл, а тут пираты"};

    static void askQuestions() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(PREFACE_QUESTION + questions[i]);
            showAnswers(i);
            checkingAnswers(acceptAnswers(), i);
        }
        showCount ();
    }
}
