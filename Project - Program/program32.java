
import java.util.Scanner;

class program32
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter string : ");
        String str=sobj.nextLine();
        String Arr[]=str.split(" ");

        System.out.println("Number of words are: "+Arr.length);
        
        
    }
    
}
