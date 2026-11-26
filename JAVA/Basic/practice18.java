import java.util.Scanner;

public class practice18 
{
    public static void main( String A[])
    {
        int iNo1 = 0;
        int iNo2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        iNo1 = scanner.nextInt();

        System.out.println("Enter second number :");
        iNo2 = scanner.nextInt();

        if(iNo1 > iNo2)
        {
            System.out.println("Greater number is :"+iNo1);
        }
        else
        {
            System.out.println("Greater number is :"+iNo2);
        }
    }   
}

