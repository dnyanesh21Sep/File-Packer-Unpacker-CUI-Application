import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

class program9
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("-------Dnyanesh Packer Unpacker CUI Module -------");

        System.out.println("Enter File name that you to open for writting : ");
        String File_Name = sobj.nextLine();

        File fobj = new File(File_Name);

        if(fobj.exists())
        {
            FileInputStream fiobj=new FileInputStream(fobj);
            byte Arr[]=new byte[20];

            fiobj.read(Arr);
            System.out.println("Data from file is : "+Arr);
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}
