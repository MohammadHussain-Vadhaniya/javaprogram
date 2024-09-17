class A
{
    public int sum;
    int a=100;
    int b=100;
    A()
    {
        sum=a+b;
    }
}
class B extends A
{
    public int Mul;
    B()
    {
        Mul=a*b;
    }
}

class Multilevelinheritance extends B
{
    public static void main(String[] args)
    {
        Multilevelinheritance MI1 = new Multilevelinheritance();
        // A a1 = new A();  Can also be done like this 
        // B b1 = new B();
        System.out.println("Sum = "+MI1.sum);
        System.out.println("Sum = "+MI1.Mul);
    }
}