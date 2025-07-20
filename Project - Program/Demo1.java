

class Demo
{
    private Demo()
    {
        System.out.println("Inside Constructor : ");

    }
    public static Demo GetObject()
    {
        return new Demo();

    }
}
class Demo1
{
    public static void main(String[] args)
    {
        Demo dobj=Demo.GetObject();

    }
}
