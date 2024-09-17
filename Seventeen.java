class Seventeen
{
    public static void  main(String[] args)
    {
        Seventeen s1 = new Seventeen();
        System.out.println(s1.sum(5,5));
        System.out.println(s1.sum(5,5,5));
        System.out.println(s1.sum(2.5,3.6));
    }
    int sum(int a,int b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    double sum(double a,double b)
    {
        return a+b;
    }
}