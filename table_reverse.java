import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class table_reverse
{
    public static void main(String[] args)
    
    {
        System.out.println("enter no.");
        Scanner hk= new Scanner(System.in);
        int i= hk.nextInt();

        for (int x = 10; x > 0; x--) 
        {
            System.out.println(i+"X"+x+"="+x*i);
        }
        
    }
}
