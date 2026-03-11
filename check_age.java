import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class check_age
{
    public static void main(String[] args)
    { 
        Scanner hk = new Scanner(System.in);
        while(true)
        {
            
            int age;
            System.out.println("Enter age:");
            age= hk.nextInt();
            if (age>60) 
            {   
                System.out.println("you are senior citizen");
            }
            else if (age>=18)
                {
                System.out.println("you are eligible to vote");
            }
            else
            {
                System.out.println("you are junier");
            }
        }
    }
}
