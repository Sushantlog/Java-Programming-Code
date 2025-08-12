package Java_Code;

//Harshad number

import java.util.Scanner;

public class _25_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number is: ");
        int num = scanner.nextInt();

        int result = 0;
        int pickNum;
        int originalNum = num;

        while (num != 0){
            pickNum = num % 10;
            result = result + pickNum;
            num = num / 10;
        }

        if(originalNum % result == 0){
            System.out.println("The Number is Harshad Number");
        }else {
            System.out.println("The Number is Not Harshad Number.");
        }
    }
}
