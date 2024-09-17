//From int to byte
class Typecasting
{
    public static void main(String args[])
    {
        int a=500;
        byte b;
        b=(byte)a;
        System.out.println(b);
        System.out.println(b+" is type of "+((Object)b).getClass().getSimpleName());
    }
}