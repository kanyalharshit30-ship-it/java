import java.util.Scanner;

public class strings{
    public static void main(String[] args)
    {
        //  A string is the sequence of characters.
        //  String is a class but can be used as datatypes.
        //  String are immutable i.e  that cannot be changed.
        
        //     STRING METHODS
        String name = "Harshu";
        String name1 = "Harshu kanyal";
        System.out.println(name.length());// Tells the actual length of str.

        System.out.println(name.toLowerCase());// returns the str which has all the char in SMALL case.
        System.out.println(name.toUpperCase());// returns the str which has all the char in UPPER case.
        
        System.out.println(name1.trim());// returns a new str after removing all the spaces from the end and start.

        System.out.println(name.substring(3));// return substring start from index 3 
        System.out.println(name.substring(0,4));// return substring from start index to n-1

        System.out.println(name.replace('H','p'));// return substring from start index to n-
        
        System.out.println(name.startsWith("Ha"));// return true if the substring starts with given char or no.
        System.out.println(name.endsWith("ahu"));// return true if the substring ends with given char or no.

        System.out.println(name.charAt(4)); // returns character at the given index no.
        
        System.out.println(name.indexOf('s')); // returns character at the given index no.
        System.out.println(name1.indexOf("a",2)); // returns character at the given string starting from given index no IF IT RETURNS -1 THEN THE CHAR IS NOT IN STRING.
        System.out.println(name1.lastIndexOf('a'));

        System.out.println(name.equals("harshu")); // returns true if the given string is equal to given string 
        System.out.println(name.equalsIgnoreCase("harshu")); // returns true if the given string is equal to given string ignoring cases of he characters.
    }
}
    