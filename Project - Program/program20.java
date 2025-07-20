import java.io.File;
import java.util.Scanner;

class program20
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("-----Dnyanesh Packer Unpacker------");

        System.out.println("Enter the name of Directory that you want to open : ");

        String Folder_Name=sobj.nextLine();

        File fobj=new File(Folder_Name);

        if(fobj.exists())
        {
            File Arr[]=fobj.listFiles();
            System.out.println("Number of files in directory are : "+Arr.length);

            int i=0;
            for(i=0;i<Arr.length;i++)
            {
                System.out.println(""+Arr[i]);
            }
        }
        else
        {
            System.out.println("There is no such directory");
        }  
        
    }
    
}
