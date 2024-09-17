import java.util.Scanner;
class eightjava
{
    public static void main(String[] args)
    {
        int sum=0,no,digit;
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        while(no>0)
        {
            digit=no%10;
            sum=sum+digit;
            no=no/10;
        } 
        System.out.println("sum of digit of given number is"+sum);


    }
}    