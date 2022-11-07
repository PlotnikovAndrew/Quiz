package ru.otus.homeworks.hw2;


public class Application {
        public static void main(String[] args) {
            String[] answersForFirstQuestionString = {"Кавказкая пленница, или Новые приключения Шурика", "Человек с бульвара Капуцинов", "Бриллиантовая рука"};
            Answer answersForFirstQuestion = new Answer(answersForFirstQuestionString);
            Question firstQuestion = new Question("Идите, идите. Мы Вас вылечим. Алкоголики - это наш профиль.", answersForFirstQuestion.getAnswers(),1);
            firstQuestion.showQuestion();
            answersForFirstQuestion.showAnswers(answersForFirstQuestion.getAnswers());
            answersForFirstQuestion.checkingAnswers(answersForFirstQuestion.acceptAnswers(),answersForFirstQuestion.getAnswers(),"Кавказкая пленница, или Новые приключения Шурика", 1);

            String[] answersForSecondQuestionString = {"Доживем до понедельника", "Королева бензоколонки", "Покровские ворота"};
            Answer answersForSecondQuestion = new Answer(answersForSecondQuestionString);
            Question secondQuestion = new Question("Ну, юноша, самовыражайтесь быстрее", answersForSecondQuestion.getAnswers(),3);
            secondQuestion.showQuestion();
            answersForSecondQuestion.showAnswers(answersForSecondQuestion.getAnswers());
            answersForSecondQuestion.checkingAnswers(answersForSecondQuestion.acceptAnswers(),answersForSecondQuestion.getAnswers(),"Покровские ворота", 3);

            String[] answersForThirdQuestionString = {"Кин-дза-дза!", "Невероятные приключения итальянцев в России", "Гостья из будущего"};
            Answer answersForThirdQuestion = new Answer(answersForThirdQuestionString);
            Question thirdQuestion = new Question("Да я же говорю - я за кефиром пошёл, а тут пираты", answersForThirdQuestion.getAnswers(),3);
            thirdQuestion.showQuestion();
            answersForThirdQuestion.showAnswers(answersForThirdQuestion.getAnswers());
            answersForThirdQuestion.checkingAnswers(answersForThirdQuestion.acceptAnswers(),answersForThirdQuestion.getAnswers(),"Гостья из будущего", 3);

            Counter.showCount();
    }
}