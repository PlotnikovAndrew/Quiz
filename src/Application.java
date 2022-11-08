package ru.otus.homeworks.hw2;

public class Application {

        public static void main(String[] args) {
            String[] answersForFirstQuestionString = {"Кавказкая пленница, или Новые приключения Шурика", "Человек с бульвара Капуцинов", "Бриллиантовая рука"};
            String[] answersForSecondQuestionString = {"Доживем до понедельника", "Королева бензоколонки", "Покровские ворота"};
            String[] answersForThirdQuestionString = {"Кин-дза-дза!", "Невероятные приключения итальянцев в России", "Гостья из будущего"};
            Question firstQuestion = new Question("Идите, идите. Мы Вас вылечим. Алкоголики - это наш профиль.", answersForFirstQuestionString,1);
            Question secondQuestion = new Question("Ну, юноша, самовыражайтесь быстрее", answersForSecondQuestionString,3);
            Question thirdQuestion = new Question("Да я же говорю - я за кефиром пошёл, а тут пираты", answersForThirdQuestionString,3);
            Question[] quiz = {firstQuestion, secondQuestion, thirdQuestion};
            for (Question question : quiz) {
                question.showQuestion();
                Answer.showAnswers(question.getAnswers());
                Answer.checkingAnswers(Answer.acceptAnswers(), question.getAnswers(), question.getCorrectAnswerString(question.getCorrectAnswerInt()), question.getCorrectAnswerInt());
            }

            Counter.showCount();
    }
}