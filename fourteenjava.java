import java.util.Scanner;
class fourteenjava
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Name : ");
        String name = input.nextLine();
        System.out.println("Enter Your Basic Salary : ");
        int basic = input.nextInt();
        int da=basic/10;
        double hra=basic * (7.5/100);
        double pf=basic * (12.5/100);
        double gross=basic+da+hra+300;
        double nt=gross-pf;

        System.out.println("-----------Employee Salary Slip----------");
        System.out.println("\t\tName = "+name);
        System.out.println("-----------------------------------------");
        System.out.println("Basic Salary = "+basic);
        System.out.println("Pf = "+basic+"* (12.5/100) = "+pf);
        System.out.println("Net Salary = "+gross+" - "+pf+" = "+nt);
        input.close();
    }
}        
