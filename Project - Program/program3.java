import java.io.File;
import java.util.Scanner;

class program3
{
     public static void main(String[] args)throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("----- Dnyanesh  Packer Unpacker CUI Module-----");

        System.out.println("Enter the name : ");

        String File_Name=sobj.nextLine();

        File fobj=new File(File_Name);

        fobj.createNewFile();
    }  
}
