import java.util.Scanner;
public class ArrayAverageScore12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberStudents = input12.nextInt();

        //declaration variable
        int[] score = new int[numberStudents];
        int passedStudent = 0, failedStudents = 0;
        double totalPassed = 0, totalFailed = 0;
        double averagePassed = 0, averageFailed = 0;

        //looping
        for (int i = 0; i < numberStudents; i++){
            System.out.print("Enter the final score " + (i) + ": ");
            score[i] = input12.nextInt();
            if(score[i] >= 70) {
                passedStudent++;
                totalPassed += score[i];
        } else { 
            failedStudents++;
            totalFailed += score[i];
        }
    }
       //calculate average
        averagePassed = totalPassed / passedStudent;
        System.out.println("The average score of students who passed is " + averagePassed);

        averageFailed = totalFailed / failedStudents;
        System.out.println("The average score of students who failed is "+averageFailed);
    }
}
