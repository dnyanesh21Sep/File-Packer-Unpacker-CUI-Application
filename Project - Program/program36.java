
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

class program36{

    public static void main(String[] args) throws Exception 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("-----Dnyanesh Packer Unpacker-----");

        System.out.println("Enter the name of packed file that you want to open :  ");

        String PackedFile=sobj.nextLine();

        File fobj=new File(PackedFile);

        if(!fobj.exists())
        {
            System.out.println("Unable to proceed as Packed file is missing...");
            return;
        }
        FileInputStream fiobj=new FileInputStream(fobj);

        byte Header[]=new byte[100];

        fiobj.read(Header);
        System.out.println("Header of first file is ");

        String Headerx=new String(Header);
        System.out.println(Headerx);

        Headerx=Headerx.trim();
        
        String Tokens[]=Headerx.split(" ");

        System.out.println("File name is : "+Tokens[0]);
        System.out.println("File length is : "+Tokens[1]);

        File obj=new File(Tokens[0]);
        obj.createNewFile();
        
    }
}