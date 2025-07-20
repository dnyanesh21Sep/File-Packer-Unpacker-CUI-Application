import java.io.File;
import java.io.IOException;
import java.util.Scanner;


class program4
{
    public static void main(String[] args) throws IOException
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("----- Dnyanesh Packer Unpacker CUI Module-----");

        System.out.println("Enter the name : ");

        String File_Name=sobj.nextLine();

        File fobj=new File(File_Name);

        boolean bRet=fobj.createNewFile();

        if (bRet==false)
        {
            System.out.println("Unable to create file");
        }
        else
        {
            System.out.println("File gets succesfully created");
        }
    }   
}
