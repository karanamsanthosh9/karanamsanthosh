class Hello
{
    public static void main(String args[])
    {
        System.out.println("Hello world");
        Bello b = new Bello();
        b.ret();
    }
}

class Bello extends Hello
{
    void ret()
    {
        System.out.println("ret");
    }
}