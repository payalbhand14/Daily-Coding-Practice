//factor printing
import java.util.Scanner;
    
public class Practice16
{
    public static void main(String[] args) 
    {
        int i, j;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        i = scanner.nextInt();

        for (j = 1; j <= i; j++) 
        {
            if (i % j == 0) 
            {
                System.out.println(j);
            }
        }

        scanner.close();
    }
}
