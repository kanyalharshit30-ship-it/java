import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class check_year
{
    public static void main(String[] args)
    
    {
        while (true) 
        {
            Scanner hk = new Scanner(System.in);
            System.out.println("enter  year");
            int year= hk.nextInt();
            if (year % 4 ==0 && year%100 != 0 || year % 400 == 0)
            {
                System.out.println("it is a leap year");
            }
            else
            {
                System.out.println("it is normal year");
            }

        }    
    }
}
