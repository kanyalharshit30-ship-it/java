import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class patterns
{
    public static void main(String[] args)
    
    {
        System.out.println("STAR PATTERN");
        int x,y;
        for (x = 5 ; x >0; x--) 
        {
            for(y=0 ; y<x ;y++)
            {
                System.out.print("*");        
            }
            System.out.print("\n");        
        }
    }
}
