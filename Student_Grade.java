import java.util.Scanner;

public class Student_Grade {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("***Enter the all Subject Marks***");
        int Tamil,English,Maths,Science,Social;
        int sum,average;
        System.out.println("Enter Tamil Mark:");
        Tamil = as.nextInt();
        System.out.println("Enter English Mark:");
        English = as.nextInt();
        System.out.println("Enter Maths Mark:");
        Maths = as.nextInt();;
        System.out.println("Enter Science Mark:");
        Science = as.nextInt();
        System.out.println("Enter Social Mark:");
        Social = as.nextInt();
        sum = Tamil+English+Maths+Science+Social;
        average = sum / 5;
        if(average >= 90)
        {
            System.out.println("Total Mark : " + sum + "\nPercentage : " + average + "\nGrade : A");
        }
        else if (average >= 80 && average < 90)
        {
            System.out.println("Total Mark : " + sum + "\nPercentage : " + average + "\nGrade : B");
        }
        else if (average >= 70 && average < 80)
        {
            System.out.println("Total Mark : " + sum + "\nPercentage : " + average + "\nGrade : C");
        }
        else if (average >= 60 && average < 70)
        {
            System.out.println("Total Mark : " + sum + "\nPercentage : " + average + "\nGrade : D");
        }
        else if(average >= 40 && average < 60)
        {
            System.out.println("Total Mark : " + sum + "\nPercentage : " + average + "\nGrade : E");
        }
        else
        {
            System.out.println("Total Mark : " + sum + "\nPercentage : " + average + "\nGrade : Fail");
        }
    }
}
