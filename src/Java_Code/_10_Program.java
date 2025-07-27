package Java_Code;

//Sum of digits of a number

import java.util.Scanner;

public class _10_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number To Find digits Sum : ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num!=0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
