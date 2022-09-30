public class MultipleChoiceQuestion implements QuestionInterface{
    private String question;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private int answer;

    public MultipleChoiceQuestion(String inputQuestion) {
        question = inputQuestion;
        System.out.println("\n" + inputQuestion);
    }

    public String getQuestion()
    {
        return question;
    }

    public void setChoice(String inputChoice, int choiceNum)
    {
        if (choiceNum == 1)
            choice1 = inputChoice;
        else if (choiceNum == 2)
            choice2 = inputChoice;
        else if (choiceNum == 3)
            choice3 = inputChoice;
        else if (choiceNum == 4)
            choice4 = inputChoice;
        else
        {
            System.out.println("Choice number is not in range");
            System.exit(0);
        }
        System.out.println(choiceNum + ". " + inputChoice);
    }

    public String getChoice(int choiceNum)
    {
        if (choiceNum == 1)
            return choice1;
        else if (choiceNum == 2)
            return choice2;
        else if (choiceNum == 3)
            return choice3;
        else if (choiceNum == 4)
            return choice4;
        else
        {
            System.out.println("Choice number is not in range");
            System.exit(0);
            return "";
        }
    }

    public void setAnswer(int inputAnswer)
    {
        answer = inputAnswer;
    }

    public int getAnswer()
    {
        return answer;
    }
}
