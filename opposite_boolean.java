import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class opposite_boolean
{
    public static void main(String[] args)
    {
        Scanner hk= new Scanner(System.in); 
        System.out.println("Enter boolean True or False");
        boolean a;
        a=hk.nextBoolean();
        System.out.println(!a);
    }
}
