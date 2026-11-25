import java.util.Scanner;

public class practice14
{
    public static void main(String A[])
    {
        int i = 0;
        int j = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        j = scanner.nextInt();

        for(i = 0; j >= i; i += 2)
        {
            System.out.println(i);
        }

    }
}