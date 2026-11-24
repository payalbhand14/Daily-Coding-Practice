//Discription:it is used to check number is divisible by 5 or not 

import java.util.Scanner;

public class practice13 
{
    public static void main(String A[])
    {
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        num = scanner.nextInt();

        if(num % 5 == 0)
        {
            System.out.println("Number is divisible by 5");
        }
        else
        {
            System.out.println("Number is not divisible by 5");
        }
    }    
}
