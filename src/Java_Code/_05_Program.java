package Java_Code;

import java.util.Scanner;

//Greatest of two numbers
public class _05_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 =0;

        System.out.println("Check The Greatest of two number : ");

        while (true)
        {
            System.out.println("Enter The First Number : ");
            if(scanner.hasNextInt()){
                num1 = scanner.nextInt();
                break;
            }else{
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();
            }
        }

        while (true){
            System.out.println("Enter The Second Number : ");
            if(scanner.hasNextInt()){
                num2 = scanner.nextInt();
                break;
            }else{
                System.out.println("Invalid Input! Please enter a valid integer.");
                scanner.next();
            }
        }

        if(num1 == num2){
            System.out.println("Both Number are Equal");
        }else if (num1 > num2){
            System.out.println("The First Number is Greater.");
        } else{
            System.out.println("The Second Number is Greater.");
        }
        scanner.close();
    }
}
