
import java.io.File;
import java.util.Scanner;

class program14 
{
    public static void main(String[] args)throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("----Dnyanesh  Packer Unpacker ----");

        System.out.println("Enter the File name that you want to open for writting: ");

        String File_Name=sobj.nextLine();

        File fobj=new File(File_Name);

        if(fobj.exists())
        {
            System.out.println("File size is : "+fobj.length());
        }
        else
        {
            System.out.println("There is no such file");
        }
    }   
}
