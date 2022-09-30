import java.util.Random;
import java.util.Timer;


public class SimulatorDriver {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int numOfStudents = rand.nextInt(10) + 10;
        Student[] studentArray = new Student[numOfStudents];
        for (int i = 0 ; i < numOfStudents ; i++)
            studentArray[i] = new Student();
        System.out.println("\nWelcome to Student Trivia!");
        System.out.println("\nNumber of students in this class: " + studentArray.length);
        

        //creates 2 multiple choice questions and 2 true/false questions
        Timer t0 = new java.util.Timer();
        t0.schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println("\nFirst Question!");
                MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("Who was the second President of the United States?");
                question1.setChoice("Andrew Jackson", 1);
                question1.setChoice("Thomas Jefferson", 2);
                question1.setChoice("John Adams", 3);
                question1.setChoice("Zachary Taylor", 4);
                question1.setAnswer(3);
                Timer t0a = new java.util.Timer();
                t0a.schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        VotingService.collectAnswers(studentArray, 1);
                        t0a.cancel();
                    }
                }, 
                3000
                );
                t0.cancel();
            }
        }, 
        2000
        );

        Timer t1 = new java.util.Timer();
        t1.schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println("\nSecond Question!");
                MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What year was Cal Poly Pomona established?");
                question2.setChoice("1938", 1);
                question2.setChoice("1967", 2);
                question2.setChoice("1954", 3);
                question2.setChoice("1919", 4);
                question2.setAnswer(1);
                Timer t1a = new java.util.Timer();
                t1a.schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        VotingService.collectAnswers(studentArray, 1);
                        t1a.cancel();
                    }
                }, 
                3000
                );
                t1.cancel();
            }
        }, 
        7000
        );


        Timer t2 = new java.util.Timer();
        t2.schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println("\nThird Question!");
                TrueFalseQuestion question3 = new TrueFalseQuestion("It takes a sloth two weeks to digest a meal. (True/False)");
                question3.setChoice("True", 1);
                question3.setChoice("False", 2);
                question3.setAnswer(1);
                Timer t2a = new java.util.Timer();
                t2a.schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        VotingService.collectAnswers(studentArray, 2);
                        t2a.cancel();
                    }
                }, 
                3000
                );
                t2.cancel();
            }
        }, 
        12000
        );


        Timer t3 = new java.util.Timer();
        t3.schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println("\nFourth Question!");
                TrueFalseQuestion question3 = new TrueFalseQuestion("Ants can lift 5000 times their body weight. (True/False)");
                question3.setChoice("True", 1);
                question3.setChoice("False", 2);
                question3.setAnswer(1);
                Timer t3a = new java.util.Timer();
                t3a.schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        VotingService.collectAnswers(studentArray, 2);
                        System.out.println("Finished!");
                        t3a.cancel();
                    }
                }, 
                3000
                );
                t3.cancel();
            }
        }, 
        17000 
        );
    }
}
