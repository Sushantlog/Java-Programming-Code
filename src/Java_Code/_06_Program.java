package Java_Code;

import java.util.Scanner;

//Greatest of the Three numbers:

public class _06_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Check The Greatest of Three ");

        while (true){
            System.out.println("Enter The First Number : ");
            if(scanner.hasNextInt()){
                num1 = scanner.nextInt();
                break;
            }else{
                System.out.println("Invalid Number!");
                scanner.next();
            }
        }

        while (true){
            System.out.println("Enter The Second Number : ");
            if(scanner.hasNextInt()){
                num2 = scanner.nextInt();
                break;
            }else{
                System.out.println("Invalid Number!");
                scanner.next();
            }
        }

        while(true){
            System.out.println("Enter The Third Number : ");
            if(scanner.hasNextInt()){
                num3 = scanner.nextInt();
                break;
            }else{
                System.out.println("Invalid Number!");
                scanner.next();
            }
        }

        if(num1 == num2 && num2 == num3){
            System.out.println("All Three Are equal");
        } else if(num1 > num2){
            if(num1 > num3){
                System.out.println("First Number is Greater");
            }else{
                System.out.println("Third Number is Greater");
            }
        } else if (num2 > num1) {
            if(num2 > num3){
                System.out.println("Second Number is Greater");
            }else{
                System.out.println("Third Number is Greater");
            }
        }else{
            System.out.println("Third Number is Greater");
        }

        scanner.close();
    }
}
