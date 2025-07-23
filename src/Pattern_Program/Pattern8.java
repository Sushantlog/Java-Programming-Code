package Pattern_Program;

import java.util.Scanner;

//Printing odd number wise Pyramid Star Pattern
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Enter The Number :
//5
//    *
//   ***
//  *****
// *******
//*********
