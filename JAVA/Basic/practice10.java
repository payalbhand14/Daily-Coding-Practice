import java.util.Scanner;

public class practice10
{
    public static void main(String A[])
    {
        int a;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        a = scanner.nextInt();

        if(a < 0)
        {
            System.out.println("number is negative ");
        }
        else
        {
            System.out.println("Number is positive ");
        }
    }
}