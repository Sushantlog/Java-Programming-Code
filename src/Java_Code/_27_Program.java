package Java_Code;

//Friendly pair

import java.util.Scanner;

class FindSum
{
    int getSum(int num){
        int sum = 0;
        for(int i=1; i<= num; i++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}

public class _27_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Finding The Friendly Pair...");
        System.out.println("Enter The First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = scanner.nextInt();

        FindSum findSum = new FindSum();
        int sum1 = findSum.getSum(num1);
        int sum2 = findSum.getSum(num2);

        if(sum1/num1 == sum2/num2){
            System.out.println(num1+" and "+num2+" is Friendly Pair.");
        }else {
            System.out.println(num1+" and "+num2+" is not Friendly Pair.");
        }
    }
}
