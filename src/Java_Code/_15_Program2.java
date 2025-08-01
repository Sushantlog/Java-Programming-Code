package Java_Code;

import java.util.Scanner;

public class _15_Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Finding the Fibonacci Series up to Nth Term.");
        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();

        if(num <= 0){
            System.out.println("Please enter a positive integer greater than 0.");
        }else if(num == 1){
            System.out.println("Fibonacci Series up to 1 term: ");
            System.out.println("0");
        }else{
            System.out.println("Fibonacci Series up to "+num+" terms: ");
            int a = 0,b = 1;
            System.out.print(a+" , "+b);

            for(int i=2; i<num; i++){
                int nextTerm = a + b;
                System.out.print(" , "+nextTerm);
                a = b;
                b = nextTerm;
            }
        }
        scanner.close();
    }
}
