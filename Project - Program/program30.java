
import java.io.File;
import java.util.Scanner;

// Unpacking Activity
class program30
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("-----Dnyanesh Packer Unpacker CUI Module------");

        System.out.println("Enter the name of Packed that you want to open : ");
        String PackedFile = sobj.nextLine();

        File fobj = new File(PackedFile);

        if(!fobj.exists())
        {
            System.out.println("Unable to proceed as Packed file is missing...");
            return;
        }  
    }
}
