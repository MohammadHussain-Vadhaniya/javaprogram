import java.util.*;
class thirteenjava
{
    public static void main(String args[])
    {
        String rollno,name,grade;
        int sub1,sub2,sub3,sub4;
        double total,per;

        rollno = args[0];
        name =args[1];
        sub1 = Integer.parseInt(args[2]);
        sub2 = Integer.parseInt(args[3]);
        sub3 = Integer.parseInt(args[4]);
        sub4 = Integer.parseInt(args[5]);
        
        System.out.println("\n\n\t\t\t\t\t----------MARKSHEET----------");
        System.out.print("\t\t\t\t\tRoll no :"+args[0]);
        System.out.println("\t    Name :"+args[1]);
        System.out.println("\t\t\t\t\t-----------------------------");
        System.out.println("\t\t\t\t\tSUBJECT\t\t\tMARKS");
        System.out.println("\t\t\t\t\tEnglish  \t\t"+args[2]);
        System.out.println("\t\t\t\t\tMaths    \t\t"+args[3]);
        System.out.println("\t\t\t\t\tScience  \t\t"+args[4]);
        System.out.println("\t\t\t\t\tGujrati  \t\t"+args[5]);

        total=sub1 +sub2+ sub3+ sub4;

        System.out.println("\n\t\t\t\t\tTotal :"+total);

        per=(total*100)/400;

        System.out.println("\t\t\t\t\tPercentage :"+per);

        if(total>=350)
        {
             System.out.println("\n\t\t\t\t\tA Grade");
        }
        else if(total>=300)
        {
             System.out.println("\n\t\t\t\t\tB Grade");
        }
        else if(total>=250)
        {
             System.out.println("\n\t\t\t\t\tC Grade");
        }
        else if(total>=200)
        {
             System.out.println("\n\t\t\t\t\tD Grade");
        }
        else if(total>=150)
        {
             System.out.println("\n\t\t\t\t\tB Grade");
        }
        else if(total<=150)
        {
             System.out.println("\n\t\t\t\t\tFAIL");
        }

    }

}