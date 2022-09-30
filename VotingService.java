import java.util.Random;

public class VotingService {

    //collects and prints out results
    public static Student[] collectAnswers(Student[] studentArray, int typeOfQuestion)
    {
        Random rand = new Random();
        int length = studentArray.length;
        //case if multiple choice question
        if (typeOfQuestion == 1)
        {
            int numChoice1 = rand.nextInt(length);
            int numChoice2 = rand.nextInt(length - numChoice1);
            int numChoice3 = rand.nextInt(length - (numChoice1 + numChoice2));
            int numChoice4 = length - (numChoice1 + numChoice2 + numChoice3);
            System.out.println("\n" + numChoice1 + " students chose 1");
            System.out.println(numChoice2 + " students chose 2");
            System.out.println(numChoice3 + " students chose 3");
            System.out.println(numChoice4 + " students chose 4");
        }
        //case if true/false question
        else if (typeOfQuestion == 2)
        {
            int numChoice1 = rand.nextInt(length);
            int numChoice2 = length - numChoice1;
            System.out.println("\n" + numChoice1 + " students chose 1");
            System.out.println(numChoice2 + " students chose 2");
        }

        return studentArray;
    }
}
