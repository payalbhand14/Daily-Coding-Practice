// even factor printing

import java.util.Scanner;

public class practice15
{
    public static void main(String A[])
    {
        int a = 0;
        int b = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        a = scanner.nextInt();

        for(b = 1; b <= a; b++)
        {
            if((a % b)==0 && (b % 2 == 0))
            {
                System.out.println(b);
            }
        }
    }
    
}
