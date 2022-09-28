public class SimulatorDriver {
    public static void main(String[] args)
    {
        Student student1 = new Student();
        Student student2 = new Student();
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("Who was the second President of the United States?");
        question1.setChoice("Andrew Jackson", 1);
        question1.setChoice("Thomas Jefferson", 2);
        question1.setChoice("John Adams", 3);
        question1.setChoice("Zachary Taylor", 4);
        question1.setAnswer(3);
        System.out.println(question1.getQuestion());
        System.out.println(question1.getAnswer());
        TrueFalseQuestion question2 = new TrueFalseQuestion("I like birds");
        question2.setChoice("True", 1);
        question2.setChoice("False", 2);
        question2.setAnswer(1);
        System.out.println(question2.getQuestion());
        System.out.println(question2.getAnswer());
        System.out.println(student1.getID());
        System.out.println(student2.getID());
    }
}
