import java.util.Random;
import java.util.Scanner;

public class number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int score=0;
        String s;

        while (true) 
        {
            Random random = new Random();
            int num = random.nextInt(100) + 1; 
            System.out.println("Guess the number between 1 and 100. You have 3 attempts.");
            boolean guessedCorrectly = false;

            for (int j=3; j>0; j--) 
            {
                int n = sc.nextInt();
                if (num==n) 
                {
                    System.out.println("Congratulations!!!\nYou guessed the right number.");
                    score = j;
                    System.out.println("Score = " + score + "/3");
                    guessedCorrectly = true;
                    break;
                } 
                else if (n < 25) 
                {
                    System.err.println("Very Far..Better Luck Next Time");
                } 
                else if (n >= 25 && n < 50) 
                {
                    System.out.println("Far...Try Again");
                } 
                else if (n >= 50 && n < 60) 
                {
                    System.out.println("Close...Try Again");
                } 
                else if (n >= 60 && n < 64) 
                {
                    System.out.println("Very Close...Keep Trying");
                } 
                else if (n >= 65 && n < 70) 
                {
                    System.out.println("Very Close...Keep Trying");
                } 
                else if (n >= 70 && n < 80) 
                {
                    System.out.println("Close...Try Again");
                } 
                else 
                {
                    System.out.println("Far...Try Again");
                }
            }
            if (!guessedCorrectly) 
            {
                System.out.println("Score = 0");
            }
            System.out.println("Do you want to continue? (Y for yes, N for No)");
            sc.nextLine(); 
            s=sc.nextLine().trim().toUpperCase();
            if(s.equals("N")) 
            {
                System.out.println("\nThank You!\nHave a Nice Day!");
                break;
            } 
            else if (!s.equals("Y")) 
            {
                System.out.println("\nCould not understand. Please type again!");
            }
        }
    }
}

