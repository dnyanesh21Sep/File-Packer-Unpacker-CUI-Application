
class Demox
{
    private Demox()
    {
        System.out.println("Inside Constructor: ");

    }
}
class Demo
{

    public static void main(String[] args)
    {
        Demox dobj=new Demox();// We can not creates its Object because constructor is declared as private 
    }   
}
