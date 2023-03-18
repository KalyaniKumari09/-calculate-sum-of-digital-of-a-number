 import java.util.Scanner;
public class Main
{
    public static void main(String arg[])
    {
        long num, sum;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
//reads a long number from the user
        num=sc.nextLong();
//executes until the condition number!=0 becomes false
        for(sum=0; num!=0; num=num/10)
        {
//finds the last digit and add it to the variable sum
            sum = sum + num % 10;
        }
//prints the result
        System.out.println("Sum of digits: "+sum);
    }
}
