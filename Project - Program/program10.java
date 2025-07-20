import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

class program10
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------- Dnyanesh  Packer Unpacker CUI Module -------");

        System.out.println("Enter File name that you to open for writting : ");
        String File_Name = sobj.nextLine();

        File fobj = new File(File_Name);

        if(fobj.exists())
        {
            FileInputStream fiobj=new FileInputStream(fobj);
            byte Arr[]=new byte[20];

            fiobj.read(Arr);
            String str=new String(Arr);
            System.out.println("Data from file is : "+str);

            fiobj.read(Arr);
            str=new String(Arr);
            System.out.println("Data from file is : "+str);
        }
        else
        {
            System.out.println("There is no such file");
        }
        
    }
    
}
