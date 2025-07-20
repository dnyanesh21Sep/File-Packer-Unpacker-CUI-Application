import java.util.Scanner;

class program33 {
    
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter string : ");
        String str=sobj.nextLine();
        String Arr[]=str.split(" ");
        
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
    
}
