package Java_Code;

//Sum of numbers in a given range

import java.util.Scanner;

//Sum of numbers in a given range
public class _04_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter The Second Number : ");
        int num2 = scanner.nextInt();

        int sum = 0;
        for(int i=num1; i<=num2; i++){
            sum += i;
        }
//        Using Formula
//        int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
//        System.out.println("The Sum is "+ sum);

        System.out.println("The Sum Of Given Range is : "+ sum);
    }
}
