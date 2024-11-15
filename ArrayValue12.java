import java.util.Scanner;
public class ArrayValue12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        //declaration variable
        int[] finalScore = new int[10];

        //looping
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter the final score "+ i + ": ");
            finalScore[i]= input12.nextInt();
        }
        for (int i = 0; i <10; i++){
            System.out.println("Final score " + i + " is " + finalScore[i]);
            
            }
        }
    }


