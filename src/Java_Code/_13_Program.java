package Java_Code;

//Armstrong number
import java.util.Scanner;

class FindLength
{
    int NumberLength(int num){
        int len = 0;
        while(num != 0){
            len++;
            num = num / 10;
        }
        return len;
    }
}

class FindArmstrong
{
    boolean isArmstrong(int num,int lenght){
        int sum = 0,temp,digit;
        temp = num;
        while (temp != 0){
            // extract digit
            digit = temp % 10;

            // add power to sum
            sum = sum +(int)Math.pow(digit,lenght);

            temp = temp / 10;
        }
        return  num == sum;
    }
}

public class _13_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number Finding Armstrong Number OR Not ");
        int num = scanner.nextInt();

        FindLength findLength = new FindLength();
        int length = findLength.NumberLength(num);
        System.out.println("Length of Number String : "+length);

        FindArmstrong findArmstrong = new FindArmstrong();
        if(findArmstrong.isArmstrong(num,length)){
            System.out.println("The Number is Armstrong Number");
        }else {
            System.out.println("The Number is Not Armstrong Number");
        }

    }
}
