
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks in English:");
        int m1=sc.nextInt();
        System.out.println("Enter the Marks in Maths:");
        int m2=sc.nextInt();
        System.out.println("Enter the Marks in Science:");
        int m3=sc.nextInt();
        System.out.println("Enter the Marks in Hindi:");
        int m4=sc.nextInt();
        System.out.println("Enter the Marks in Social Sciences:");
        int m5=sc.nextInt();
        int sum=m1+m2+m3+m4+m5;
        double avg=sum/5.0;
        if(avg>=85)
        {
            System.out.println("Total Marks out of 500: "+sum);
            System.out.println("Average Percentage: "+avg);
            System.out.println("Grade Obtained: O");
        }
        else if(avg>=75 && avg<85)
        {
            System.out.println("Total Marks: "+sum);
            System.out.println("Average Percentage: "+avg);
            System.out.println("Grade Obtained: A+");
        }
        else if(avg>=65 && avg<75)
        {
            System.out.println("Total Marks: "+sum);
            System.out.println("Average Percentage: "+avg);
            System.out.println("Grade Obtained: A");
        }
        else if(avg>=55 && avg<65)
        {
            System.out.println("Total Marks: "+sum);
            System.out.println("Average Percentage: "+avg);
            System.out.println("Grade Obtained: B+");
        }
        else if(avg>=40 && avg<55)
        {
            System.out.println("Total Marks: "+sum);
            System.out.println("Average Percentage: "+avg);
            System.out.println("Grade Obtained: B");
        }
        else{
            System.out.println("Total Marks: "+sum);
            System.out.println("Average Percentage: "+avg);
            System.out.println("Grade Obtained: F");
        }
    }
}
