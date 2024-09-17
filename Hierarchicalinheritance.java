class Hierarchicalinheritance
{
    public int sum;
    int a=100;
    int b=100;
    Hierarchicalinheritance()
        {
            sum=a+b;
            System.out.println("Sum = "+sum);
        }
    public static void main(String[] args)
    {
        Hierarchicalinheritance HI1 = new Hierarchicalinheritance();
        B b1 = new B();
        C c1 = new C();
    }
}
class B extends Hierarchicalinheritance
{
    public int Mul;
    B()
    {
        Mul=a*b;
        System.out.println("Mul = "+Mul);
    }
}
class C extends Hierarchicalinheritance
{
    public int Div;
    C()
    {
        Div=a/b;
        System.out.println("Div = "+Div);
    }
}
