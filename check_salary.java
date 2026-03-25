import java.net.Socket;
import java.net.SocketPermission;
import java.util.Scanner;

public class check_salary
{
    public static void main(String[] args)
    
    {
        while (true) 
        {
            Scanner hk = new Scanner(System.in);
            System.out.println("enter salary");
            float salary= hk.nextFloat();
            if(250000 <= salary && salary < 500000){
                System.out.printf("the tax you got is 5 percentage %.2f\n",salary*5/100);
            }
            else if(500000 <= salary && salary < 1000000){
                System.out.printf("the tax you got is 20 percentage %.2f\n",salary*20/100);
            }
            else if(salary>1000000){
                System.out.printf("the tax you got is 30 percentage %.2f\n",salary*30/100);
            }
            else{
                System.out.println("no tax");
            }

        }    
    }
}
