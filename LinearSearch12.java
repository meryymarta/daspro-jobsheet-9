import java.util.Scanner;
public class LinearSearch12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Enter the number array elements: ");
        int n = input12.nextInt();
       
        int arrayInt[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array element " + (i) + " :");
            arrayInt[i] = input12.nextInt();
        }
        
        System.out.print("Enter the key you want to search for: ");
        int key = input12.nextInt(); 
       
        for(int i = 0; i < n; i++){
        if(arrayInt[i] == key) {
            int result = i;
            System.out.println("The key in array is located at index position " + i );
        } else {
            System.out.println("The key is not found");
            break;
        }
       }
    }
}
    
        
       
        
        
    
    

