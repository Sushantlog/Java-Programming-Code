package Java_Code;

import java.util.Scanner;

public class _16_Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number You Want to Factor : ");
        int num = scanner.nextInt();

        if(num < 0){
            System.out.println("Factorial is not defined for negative numbers. ");
        } else if (num == 0 || num == 1) {
            System.out.println("Factorial Of "+num+" is : 1");
        }else {
            int fact = 1;
            for(int i=2; i<=num; i++){
                fact *= i;
            }
            System.out.println("Factorial Of "+num+" is: "+fact);
        }
    }
}
