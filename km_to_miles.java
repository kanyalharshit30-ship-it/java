import java.util.Scanner;

public class km_to_miles{
    public static void main(String[] args)
    {
        System.out.println("enter kilometers:");
        Scanner hk= new Scanner(System.in);
        int kms = hk.nextInt();
        System.out.println(kms +" kilometers in miles is "+ kms*0.621f);
    }
}
    