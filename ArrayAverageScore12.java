import java.util.Scanner;
public class ArrayAverageScore12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        //declaration variable
        int[] score = new int[10];
        int passedStudent = 0;
        double total = 0;
        double average;

        //looping
        for (int i = 0; i < score.length; i++){
            System.out.print("The student score " + (i + 1) + ": ");
            score[i] = input12.nextInt();
            if(score[i] >= 70) {
                passedStudent++;
        }
    }
        for (int i = 0; i < score.length; i++){
            total+= score[i];
        }
        average = total / score.length;
        System.out.println("The class average score is " + average);
        System.out.println("The number of student who passed is "+passedStudent);
    }
}
