class A
{
    private int sum;
    A()
    {
        int a=100;
        int b=100;
        sum=a+b;
        System.out.println("Sum = "+sum);
    }
}
class Inheritance extends A
{
    public static void main(String[] args)
    {
        Inheritance I1 = new Inheritance();
    }
}