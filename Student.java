import java.util.Random;
public class Student {
    Random rand = new Random();
    private String ID = "014"; //all ID's start with 014
    private int answer = 0;
    public Student()
    {
        setID();
    }

    public void setID()
    {
        for (int i = 0; i < 4; i++)
            ID += rand.nextInt(10); //last 4 digits are random
    }

    public String getID()
    {
        return ID;
    }

    public void setAnswer(int input)
    {
        answer = input;
    }

    public int getAnswer()
    {
        return answer;
    }
}
