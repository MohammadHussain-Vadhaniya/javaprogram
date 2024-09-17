class Nineteen
{
    Nineteen()
    {
        System.out.println("HERE IS THE EXAMPLE OF DEFAULT CONSTRUCTOR");
    }
    Nineteen(int a,int b)
    {
        System.out.println("HERE IS THE SUM OF TWO NUMBERS USING PARAMETERIZED CONSTRUCTOR");
        System.out.println("SUM = "+ (a+b));
    }
    public static void main(String args[])
    {
       Nineteen e1 = new Nineteen();
       Nineteen e2 = new Nineteen(10,20);
    }
}