import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class check_marks
{
    public static void main(String[] args)
    
    {
        while (true) 
        {
            Scanner hk = new Scanner(System.in);
            float m1,m2,m3,total;
            System.out.println("enter marks of students:");
            System.out.println("enter marks sub 1");
            m1=hk.nextFloat();
            System.out.println("enter marks sub 2");
            m2=hk.nextFloat();
            System.out.println("enter marks sub 3");
            m3=hk.nextFloat();
            total=(m1+m2+m3)/300*100;
            System.out.println("total % is"+ total);
            if(total>=40 && m1>33 && m2>33 && m3>33)
            {
                System.out.println("you are passed");
            }
            else{
                System.out.println("you are failed");
            }

        }
    }
}
