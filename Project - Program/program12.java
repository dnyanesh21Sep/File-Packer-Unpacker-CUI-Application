import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

class program12
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("-----Dnyanesh Packer Unpacker CUI Module -------");

        System.out.println("Enter File name that you to open for Read  : ");
        String File_Name = sobj.nextLine();

        File fobj = new File(File_Name);

        if(fobj.exists())
        {
            FileInputStream fiobj=new FileInputStream(fobj);

            byte Arr[]=new byte[1024];
            int iRet=0;
            String str=null;

            while ((iRet = fiobj.read(Arr))!=-1)
            {
                str=new String(Arr);
                System.out.print(str);
            }
        }
         else
        {
            System.out.println("There is no such file");
        }   
    } 
}
