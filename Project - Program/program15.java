
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class program15
{
    public static void main(String[] args) throws Exception

    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------- Dnyanesh Packer Unpacker CUI Module -------");

        System.out.println("Enter The Name of Source File : ");
        String File_Source = sobj.nextLine();

        File fsobj = new File(File_Source);

        System.out.println("Enter The Name of Destination  File : ");

        String File_Destination= sobj.nextLine();
        File fdobj=new File(File_Destination);


        if(fsobj.exists())
        {
            FileOutputStream foobj=new FileOutputStream(fdobj);
            FileInputStream fiobj=new FileInputStream(fsobj);

            byte Arr[]=new byte[1024];
            String str=null;
            int iRet=0;

            while((iRet=fiobj.read(Arr))!=-1)
            {
              str=new String(Arr);
              foobj.write(Arr,0,iRet);
            }  
        }
        else
        {
           System.out.println("Souce file is not Present : ");
        
        }
    }
}
