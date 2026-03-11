import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner; 

public class check_no{
    public static void main(String[] args) {
        int a;
        System.out.println("enter no.");
        Scanner hk= new Scanner(System.in);
        a=hk.nextInt();
        if (a<1000) {
            System.out.println("The given no. is greater than 1000");
        }
        else{
            System.out.println("The no. is smaler than 1000");
        }
    }

    
}
    
