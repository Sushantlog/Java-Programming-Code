package Pattern_Program;

//Pyramid Star Pattern

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = scanner.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<num-1-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Enter The Number:
//5
//    *
//   **
//  ***
// ****
//*****
