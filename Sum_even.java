import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class Sum_even
{
    public static void main(String[] args)
    
    {
        System.out.println("enter no.");
        int sum=0;
        Scanner hk= new Scanner(System.in);
        int i= hk.nextInt();
        for (int x = 0; x < i+1; x++) 
        {
            if(x%2==0)
            {
                sum+=x;
            }   
        }
        System.out.println("sum of even no. till the given no. is : "+sum);
        
    }
}
