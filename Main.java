public class Main {

    public static void main(String[] args) {
        // Create the quiz service
        QuestionService quizService = new QuestionService();

        // Start the quiz
        quizService.playQuiz();

        // Print final score
        quizService.printScore();
    }
}