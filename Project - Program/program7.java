import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

class program7
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------- Dnyanesh Packer Unpacker CUI Module -------");

        System.out.println("Enter File name that you to open for writting : ");
        String File_Name = sobj.nextLine();

        File fobj = new File(File_Name);

        if(fobj.exists())
        {
            FileOutputStream foobj=new FileOutputStream(fobj);

            String str = "Marvellous";
            
            foobj.write(str.getBytes());
        }
        else
        {
            System.out.println("There is no such file"); 
        }
    }
       
}
