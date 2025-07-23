package Java_Code;

import java.util.Scanner;

public class _03_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int number = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i <= number ; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
