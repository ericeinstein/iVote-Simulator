public class Question {
    private String question;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private int answer;

    public void setQuestion(String inputQuestion)
    {
        question = inputQuestion;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setAnswer1(String inputAnswer1)
    {
        choice1 = inputAnswer1;
    }

    public String getAnswer1()
    {
        return choice1;
    }

    public void setAnswer2(String inputAnswer2)
    {
        choice2 = inputAnswer2;
    }

    public String getAnswer2()
    {
        return choice2;
    }

    public void setAnswer3(String inputAnswer3)
    {
        choice3 = inputAnswer3;
    }

    public String getAnswer3()
    {
        return choice3;
    }

    public void setAnswer4(String inputAnswer4)
    {
        choice4 = inputAnswer4;
    }

    public String getAnswer4()
    {
        return choice4;
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
