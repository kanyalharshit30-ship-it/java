import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class check_website
{
    public static void main(String[] args)
    
    {
        while (true) 
        {
            Scanner hk = new Scanner(System.in);
            System.out.println("enter website");
            String website= hk.next();
            if(website.endsWith(".com") )
            {
                System.out.println("you entered a comercial website");
            }
            else if(website.endsWith(".org"))
            {
                System.out.println("you entered a organization website");
            }
            else if(website.endsWith(".in"))
            {
                System.out.println("you entered a indian website");
            }
            else
            {
                System.out.println("invalid website .s!");
            }
        }    
    }
}
