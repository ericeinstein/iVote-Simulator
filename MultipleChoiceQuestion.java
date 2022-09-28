public class MultipleChoiceQuestion implements Question{
    private String question;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private int answer;

    public MultipleChoiceQuestion(String inputQuestion) {
        question = inputQuestion;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setChoice(String inputAnswer, int choiceNum)
    {
        if (choiceNum == 1)
            choice1 = inputAnswer;
        else if (choiceNum == 2)
            choice2 = inputAnswer;
        else if (choiceNum == 3)
            choice3 = inputAnswer;
        else if (choiceNum == 4)
            choice4 = inputAnswer;
        else
        {
            System.out.println("Choice number is not in range");
            System.exit(0);
        }
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
