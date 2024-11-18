import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Enter the Number of element: ");
        int n = input12.nextInt();


        int[] numbers = new int[n];
        int i = 0;
        while (i < n) {
            System.out.print("Enter the element " + (i + 1) + " :");
            numbers[i] = input12.nextInt();
            i++;
        }
    int highhestValue = numbers[0];
    int lowestValue = numbers[0];
    int sum = 0;

    for(int number : numbers) {
        if (number > highhestValue) {
            highhestValue = number;
        }
        if (number < lowestValue) {
            lowestValue = number;
        }
        sum += number;
    }
    double averageValue = sum / n;

    System.out.println("Highest Value: " + highhestValue);
    System.out.println("Lowest Value: " + lowestValue);
    System.out.println("Average Value : " + averageValue);
}}