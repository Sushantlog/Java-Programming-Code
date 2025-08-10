package Java_Code;

//Perfect Square

import java.util.Scanner;

public class _22_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number you want find perfect square : ");
        int num = scanner.nextInt();

        boolean isPerfect = false;

        for(int i=1; i*i<=num; i++){
            if(i*i == num){
                isPerfect= true;
                break;
            }
        }

        if(isPerfect){
            System.out.println(num+" is Perfect Square.");
        }else {
            System.out.println(num+" is not Perfect Square.");
        }
    }
}
