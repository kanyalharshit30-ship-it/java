import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class switch_x
{
    public static void main(String[] args)
    
    {
        while (true) 
        {
        Scanner hk =  new Scanner(System.in);
        System.out.println("Enter no.");
        int a= hk.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("monday");
                break;
        
            case 2:
                System.out.println("tuesday");
                break;
        
            case 3:
                System.out.println("wednesday");
                break;
        
            case 4:
                System.out.println("thursday");
                break;
        
            case 5:
                System.out.println("friday");
                break;
        
            case 6:
                System.out.println("saturday");
                break;
        
            case 7:
                System.out.println("sunday");
                break;
        
            default:
                System.out.println("entered no. is invalid");
                break;   
        }
        
        }
    }
}
