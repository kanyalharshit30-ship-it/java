import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class random_strings{
    public static void main(String[] args)
    {
        String name = "HA RSHit";
        System.out.println(name.toLowerCase());

        System.out.println(name.replace(" ","_"));

        String letter = "dear <|name|> nice to meet you";
        System.out.println(letter.replace("<|name|>","harshu"));

        String bentley="this line contains  double spaces and  triple spaces";
        System.out.println(bentley.indexOf("  "));
        System.out.println(bentley.indexOf("   "));

        String bmw = "dear Harshu, \n\tThis is your bmw and bentley.\n\tThankyou.";
        System.out.println(bmw);
    }   
}
    