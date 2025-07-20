
import java.io.File;
import java.util.Scanner;

class program18
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("-----Dnyanesh  Packer Unpacker------");

        System.out.println("Enter the name of Directory that you want to open : ");

        String Folder_Name=sobj.nextLine();

        File fobj=new File(Folder_Name);

        if(fobj.exists())
        {
            System.out.println("Directory is present");
        }
        else
        {
            System.out.println("There is no such directory");
        }   
    } 
}
