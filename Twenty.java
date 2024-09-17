class Twenty
{
    int total;
    Twenty()
    {
        System.out.println("I AM A DEFAULT CONSTRUCTOR");
    }
    Twenty(int a,int b)
    {
        System.out.println("HERE IS THE SUM OF TWO NUMBERS USING PARAMETERIZED CONSTRUCTOR");
        total = a+b;
        System.out.println("SUM = "+ total);
    }
    Twenty(int a,int b,int c)
    {
        System.out.println("HERE IS THE SUM OF THREE NUMBERS USING PARAMETERIZED CONSTRUCTOR");
        total = a+b+c;
        System.out.println("SUM = "+ total);
    }
    public static void main(String args[])
    {
       Twenty e1 = new Twenty();
       Twenty e2 = new Twenty(10,20);
       Twenty e3 = new Twenty(10,20,30);
    }
}