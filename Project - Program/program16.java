
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class program16
{
    public static void main(String[] args)throws  Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("-----Dnyanesh Packer Unpacker CUI Module-----");

        System.out.println("Enter the source of file name: ");
        String Source=sobj.nextLine();
        System.out.println("Enter the destination file name : ");
        String Destination = sobj.nextLine();

        File sourceobj=new File(Source);

        if(sourceobj.exists())
        {
            File destobj=new File(Destination);
            boolean bret=destobj.createNewFile();
             if(bret == false)
            {
                System.out.println("Unable to create new file");
                return;
            }
             FileInputStream fiobj = new FileInputStream(sourceobj);
            FileOutputStream foobj = new FileOutputStream(destobj);

            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer);
            }
        }
        else
        {
            System.out.println("Unable to complete as Source file is not present");
        }  
    }   
}
