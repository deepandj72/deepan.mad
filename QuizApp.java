import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        // Questions
        String[] questions = {
            "1) Which language runs in a web browser?\nA) Java  B) C  C) Python  D) JavaScript",
            "2) What is the capital of India?\nA) Delhi  B) Mumbai  C) Kolkata  D) Chennai"
        };
        char[] answers = {'D','A'};   // correct answers

        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer (A/B/C/D): ");
            char user = Character.toUpperCase(sc.next().charAt(0));
            if (user == answers[i]) score++;
        }
        System.out.println("\nYou scored " + score + " out of " + questions.length);
        sc.close();
    }
}
