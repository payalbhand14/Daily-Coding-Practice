//Check voting eligibility

import java.util.Scanner;

public class practice19 
{
    public static void main( String A[])
    {
        int Age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Age :");
        Age = scanner.nextInt();

        if(Age >= 18)
        {
            System.out.println("Eligible for voting ");
        }
        else if(Age > 0 && Age < 18)
        {
            System.out.println("Not eligible for voting ");
        }
        else
        {
            System.out.println("Invalid age");
        }
    } 
}
