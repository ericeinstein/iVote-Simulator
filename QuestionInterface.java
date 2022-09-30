interface QuestionInterface {
    public String getQuestion();

    public void setChoice(String inputAnswer, int choiceNum);

    public String getChoice(int choiceNum);

    public void setAnswer(int inputAnswer);

    public int getAnswer();
}
