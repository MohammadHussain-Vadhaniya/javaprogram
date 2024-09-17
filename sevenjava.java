import java.util.Scanner;
class sevenjava
{

    public static void main(String args[])
    {
        double sum=0,n;
        System.out.println("1 + 1/2 + 1/3.....1/n");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        for(int i=1;i<=n;i++)
        {
            sum=sum+(1.0/i);
        }
         System.out.println("Sum of series :"+sum);
    }
}