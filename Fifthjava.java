class Fifthjava
{
    public static void main(String[] args)
    {
        int a=Integer.parseInt(args[0]);
        // int b=Integer.parseInt(args[0]);
        // int c=Integer.parseInt(args[0]);
        switch(a)
        {
            case 1:
                {
                    System.out.println("Entered Number is One");
                    break;
                }
            case 2:
                {
                    System.out.println("Entered Number is Two");
                    break;
                }
            case 3:
                {
                    System.out.println("Entered Number is Three");
                    break;
                }
            default :
                {
                     System.out.println("Entered Number is other than 1,2,3!!!"); 
                }            
        }

    }
}