import java.util.Random;
import java.util.Timer;


public class SimulatorDriver {
    public static void main(String[] args)
    {
        //creates 2 multiple choice questions and 2 true/false questions
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("Who was the second President of the United States?");
        question1.setChoice("Andrew Jackson", 1);
        question1.setChoice("Thomas Jefferson", 2);
        question1.setChoice("John Adams", 3);
        question1.setChoice("Zachary Taylor", 4);
        question1.setAnswer(3);

        Timer t = new java.util.Timer();
        t.schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What year was Cal Poly Pomona established?");
                question2.setChoice("1938", 1);
                question2.setChoice("1967", 2);
                question2.setChoice("1954", 3);
                question2.setChoice("1919", 4);
                question2.setAnswer(1);
                t.cancel();
            }
        }, 
        1000
        );

        Timer t2 = new java.util.Timer();
        t2.schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                TrueFalseQuestion question3 = new TrueFalseQuestion("It takes a sloth two weeks to digest a meal. (True/False)");
                question3.setChoice("True", 1);
                question3.setChoice("False", 2);
                question3.setAnswer(1);
                t2.cancel();
            }
        }, 
        2000 
        );

        Timer t3 = new java.util.Timer();
        t3.schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                TrueFalseQuestion question3 = new TrueFalseQuestion("Ants can lift 5000 times their body weight. (True/False)");
                question3.setChoice("True", 1);
                question3.setChoice("False", 2);
                question3.setAnswer(1);
                t3.cancel();
            }
        }, 
        3000 
        );
        
        
    }
}
