package Java_Code;

//Reverse of a number

import java.util.Scanner;

public class _11_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number to Reverse : ");
        int num = scanner.nextInt();

        int reverse = 0;
        int rem;
        while (num != 0){
            rem = num % 10;
            reverse = reverse * 10 +rem;
            num = num / 10;
        }
        System.out.println("Reversed Number : "+reverse);
    }
}

// 1/10 = 0;
// 1%10 = 1;