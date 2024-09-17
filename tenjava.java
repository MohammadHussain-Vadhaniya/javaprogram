class tenjava
{
    public static void main(String args[])
    {
        int no=0;
        while(no<11)
        {
             no++;
            if(no==5)
            {
                continue;
            }
            else
            {
                System.out.println("Number ="+no);
            }
        }
    }
}    