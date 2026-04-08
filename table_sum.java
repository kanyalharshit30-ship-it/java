import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class table_sum
{
    public static void main(String[] args)
    
    {
        System.out.println("enter no.");
        Scanner hk= new Scanner(System.in);
        int i= hk.nextInt();
        int sum=0;
        for (int x = 1; x < 11; x++) 
        {
            System.out.println(i+"X"+x+"="+i*x);
            sum+=i*x;
        }
        System.out.println("the sum of all tha no. in the table is : " +sum);
        
    }
}
