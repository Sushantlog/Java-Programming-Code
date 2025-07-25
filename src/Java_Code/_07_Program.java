package Java_Code;

//Leap year or not

import java.util.Scanner;

public class _07_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = scanner.nextInt();

        if(year % 400 == 0){
            System.out.println(year + " is leap year");
        }else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is not leap year");
        }

        scanner.close();
    }
}
