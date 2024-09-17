//prime number
class sixthjava
{
    public static void main(String[] args)
    {
        int flag=0;
         int a=Integer.parseInt(args[0]);
         if(a==0||a==1)
         {
            System.out.println(a+"is not prime number");
         }
         else{
         for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                 System.out.println(a+"is not prime number");
                 flag=1;
                 break;
            }
        }
        if(flag==0)
        {
             System.out.println(a+"is prime number");
        }
         }
    }

}