package Java_Code;

//Even or Odd number:

import java.util.Scanner;

public class _02_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number to check Even or Odd Number : ");
        int num = scanner.nextInt();

        if(num%2 == 0){
            System.out.println("The Number is Even");
        }else {
            System.out.println("The Number is Odd");
        }
    }
}
