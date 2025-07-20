
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


class program39
{
    public static void main(String[] args) throws  Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("-----Dnyanesh Packer Unpacker CUI Module-----");

        System.out.println("Enter the name of Packed that you want to open : ");

        String PackedFile=sobj.nextLine();

        File fobj=new File(PackedFile);

        if(!fobj.exists())
        {
            System.out.println("Unable to proceed as Packed file is missing...");
            return;
        }

        FileInputStream fiobj=new FileInputStream(fobj);
        byte Header[]=new byte[100];
        int iRet=0;
        String Headerx=null;
        File obj=null;
        int FileSize=0;
        FileOutputStream foobj=null;

        while((iRet=fiobj.read(Header,0,100))>0)
        {
            Headerx=new String(Header);
            Headerx=Headerx.trim();
            String Tokens[] = Headerx.split(" ");

            obj=new File(Tokens[0]);

            obj.createNewFile();

            FileSize=Integer.parseInt(Tokens[1]);

            byte Buffer[]=new byte[FileSize];
            fiobj.read(Buffer,0,FileSize);

            foobj=new FileOutputStream(obj);
            foobj.write(Buffer,0,FileSize);
            foobj.close();
        }
        fiobj.close();  
    }
    
}
