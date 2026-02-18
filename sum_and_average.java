import java.util.Scanner;

public class sum_and_average{
    public static void main(String[] args)
    {
        
        System.out.println("entering the no. form user:");
        Scanner hk =new Scanner(System.in);
        System.out.println("enter no.");
        int a=hk.nextInt();

        System.out.println("enter no. 2");
        int b=hk.nextInt();

        float sum=a+b;
        float average=sum/2;

        System.out.println("sum of no is:"+sum);
        System.out.println("average of no is:"+average);

        
    }
}
    