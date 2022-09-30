public class TrueFalseQuestion implements QuestionInterface{
    private String question;
    private String choiceTrue;
    private String choiceFalse;
    private int answer;

    public TrueFalseQuestion(String inputQuestion) {
        question = inputQuestion;
        System.out.println(question);
    }

    public String getQuestion()
    {
        return question;
    }

    public void setChoice(String inputChoice, int choiceNum)
    {
        if (choiceNum == 1)
            choiceTrue = inputChoice;
        else if (choiceNum == 2)
            choiceFalse = inputChoice;
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