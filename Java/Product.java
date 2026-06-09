import java.util.Scanner;
public class Product 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of which you want to print the table : ");
        n = in.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
