class Sixteenjava
{
    int c;
    public static void main(String[] args)
    {
        Sixteenjava s = new Sixteenjava();
        s.TotalSum();
    }
    public void TotalSum()
    {
        c = Add(10,20);
        System.out.println(c);
    }
    public int Add(int a,int b)
    {
        return a+b;   
    }
}