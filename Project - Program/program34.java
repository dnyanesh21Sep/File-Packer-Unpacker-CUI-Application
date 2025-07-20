import java.util.Scanner;

class program34{

    public static void main(String[] args)
    {
       Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        System.out.println("Length of string is "+str.length());

        str = str.trim();

        System.out.println("Length of string is "+str.length());  
    }    
}
