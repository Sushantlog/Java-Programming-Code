package Pattern_Program;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The row to print : ");
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Enter The row to print :
//5
//****
// ****
//  ****
//   ****
