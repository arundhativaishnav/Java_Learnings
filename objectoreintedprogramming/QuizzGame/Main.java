package objectoreintedprogramming.QuizzGame;

public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.playQuizz();
        service.printScore();
    }
}
