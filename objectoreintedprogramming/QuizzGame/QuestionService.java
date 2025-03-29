package objectoreintedprogramming.QuizzGame;

import java.util.Objects;
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new  String[5];

    public QuestionService(){
        questions[0] = new Question(1,"what is popular language ?", "java ","python","cpp", "javascript","java");
        questions[1] = new Question(2,"what is size of int  ?", "2","4","5", "6","4");
        questions[2] = new Question(3,"what is size of char  ?", "1 ","2","3", "4","1");
        questions[3] = new Question(4,"what is the big int  ?", "100 ","67","89", "200","200");
        questions[4] = new Question(5,"what jdbc stands for?", "java database connection ","java data base connectivity","non of the above ", "both option 1 and 2","java database connectivity");
    }

    public void playQuizz() {
        int i =0;
        for (Question q : questions) {
            System.out.println("Question number:" + q.getQ_id());
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());

            Scanner sc= new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s : selection){
            System.out.println(s);
        }

    }

    public void printScore() {
        int score =0;
        for (int i = 0; i < questions.length ; i++) {
            Question que =  questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if(answer.equals(userAnswer)){
                score++;
            }

        }
        System.out.println("YOUR SCORE IS : "+ score);
    }
}
