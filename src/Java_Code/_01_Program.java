package Java_Code;

//Positive or Negative number:

import java.util.Scanner;

public class _01_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number to check positive or negative :");
        int num = scanner.nextInt();

        if(num == 0){
            System.out.println("The Number is Zero");
        }else{
            String result = num > 0 ? "Positive Number ":"Negative Number";
            System.out.println(result);
        }
    }
}
