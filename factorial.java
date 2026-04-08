import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class factorial
{
    public static void main(String[] args)
    
    {
        System.out.println("enter no.");
        Scanner hk= new Scanner(System.in);
        int i= hk.nextInt();
        int fact=1;
        for (int x = i; x > 1; x--) 
        {
            fact*=x;
        }
        System.out.println("Factorial of a given no. is : "+ fact);
    }
}
