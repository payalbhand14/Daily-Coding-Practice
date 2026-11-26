import java.util.Scanner;

public class practice17 
{
    public static void main( String A[])
    {
        int chkNum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        chkNum = scanner.nextInt();

        if(chkNum > 0)
        {
            System.out.println("Number is positive");
        }
        else if(chkNum < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }


        
    }   
}
