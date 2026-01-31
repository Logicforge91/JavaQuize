import java.util.Scanner;

public class QuestionService {

    Question[]  questions = new Question[5];

    String  selection[] = new String[5];
    

    public QuestionService() {
        questions[0] = new Question(
    1,
    "Which of the following is a primitive data type in Java?",
    "String",
    "int",
    "ArrayList",
    "Scanner",
    "int"
);

questions[1] = new Question(
    2,
    "What is the size of a boolean in Java?",
    "1 byte",
    "4 bytes",
    "Depends on JVM",
    "2 bytes",
    "Depends on JVM"
);

questions[2] = new Question(
    3,
    "Which data type would you use to store a single character?",
    "char",
    "String",
    "int",
    "boolean",
    "char"
);

questions[3] = new Question(
    4,
    "Which of these can hold decimal values?",
    "int",
    "float",
    "char",
    "boolean",
    "float"
);

questions[4] = new Question(
    5,
    "What is the default value of an int variable in Java?",
    "0",
    "null",
    "0.0",
    "undefined",
    "0"
);
    
    
}



    public void playQuize(){

     int i = 0;
       for(Question q : questions) {
    System.out.println("Question no: " + q.getId());
    System.out.println("Q: " + q.getQuestion());
    System.out.println("1. " + q.getOpt1());
    System.out.println("2. " + q.getOpt2());
    System.out.println("3. " + q.getOpt3());
    System.out.println("4. " + q.getOpt4());
    Scanner sc =  new Scanner(System.in);
     selection[i]  = sc.nextLine();
     i++;

}


    }

    public void printScore()
    {
         int  score = 0;
         for(int i =0; i< questions.length; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if(actualAnswer.equals(userAnswer)){
                score++;

            }

         }
         System.out.println("Your Score is :"+score);

    }
}

