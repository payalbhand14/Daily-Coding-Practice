import java.util.Scanner;

public class practice9
{
    public static void main(String A[])
    {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        a = scanner.nextInt();

        System.out.println("Enter number :");
        b = scanner.nextInt();

        if(a > b)
        {
            System.out.println("Maximum Number is :"+a);
        }
        else if(a < b)
        {
            System.out.println("Maximum Number is :"+b);
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
    }
}