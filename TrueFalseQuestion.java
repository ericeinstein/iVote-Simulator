public class TrueFalseQuestion implements Question{
    private String question;
    private String choiceTrue;
    private String choiceFalse;
    private int answer;

    public TrueFalseQuestion(String inputQuestion) {
        question = inputQuestion;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setChoice(String inputAnswer, int choiceNum)
    {
        if (choiceNum == 1)
            choiceTrue = inputAnswer;
        else if (choiceNum == 2)
            choiceFalse = inputAnswer;
        else
        {
            System.out.println("Choice number is not in range");
            System.exit(0);
        }
    }

    public String getChoice(int choiceNum)
    {
        if (choiceNum == 1)
            return choiceTrue;
        else if (choiceNum == 2)
            return choiceFalse;
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