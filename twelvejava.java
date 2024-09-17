import java.util.*;
class twelvejava
{
    public static void main(String[] args)
    {
        int[] no = {1,4,6,3,9};
        System.out.println("Before Sorting");
        int temp;
        for(int i=0;i<no.length;i++)
        {
            System.out.println(no[i]);
        }
        for(int i=0;i<no.length;i++)
        {
            for(int j=i+1;j<no.length;j++)
            {
                if(no[i]>no[j])
                {
                    temp=no[i];
                    no[i]=no[j];
                    no[j]=temp;
                }
            }
        }
         System.out.println("After Sorting of Array:");
         for(int i=0;i<no.length;i++)
         {
             System.out.println(no[i]);
         }

    }
}