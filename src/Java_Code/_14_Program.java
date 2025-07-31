package Java_Code;

//Armstrong number in a given range

import java.util.Scanner;

class FindRang
{
    int getLength(int num){
        int len = 0;
        while(num!=0){
            len++;
            num = num / 10;
        }
        return len;
    }

    void FindArmstrongRang(int low, int high){
        for(int num=low; num<=high; num++){
            int sum=0;
            int digit;
            int temp;
            int length = getLength(num);
            temp =num;

            while (temp != 0){
                digit = temp % 10;
                sum = sum + (int)Math.pow(digit,length);
                temp = temp / 10;
            }

            if(num == sum){
                System.out.print(num + " ");
            }

        }
    }
}


public class _14_Program {
    public static void main(String[] args) {
        System.out.println("Find The Armstrong Number Range. ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Lower Number : ");
        int low = scanner.nextInt();

        System.out.println("Enter The Higher Number : ");
        int high = scanner.nextInt();

        FindRang findRang = new FindRang();
        findRang.FindArmstrongRang(low,high);

    }
}
