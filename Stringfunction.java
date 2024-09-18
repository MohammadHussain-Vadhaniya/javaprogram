class Stringfunction
{
    public static void main(String[] args)
    {
        Stringfunction s = new Stringfunction();
        s.lowerCase();
        s.upperCase();
        s.trim();
        s.chatAt();
        s.length();
        s.replace();
        s.appends();
        s.deletes();
        s.reverses();
        s.inserts();
    }
    public void lowerCase()
    {
        String s="Mohammad Virat Kohli";    
        System.out.println("Lowercase = "+s.toLowerCase());        
    }
    public void upperCase()
    {
        String s="Mohammad Virat Kohli";    
        System.out.println("Uppercase = "+s.toUpperCase());        
    }
    public void trim()  
    {  
        String s="  Mohammad Virat Kohli  ";          
        System.out.println("Trim = "+s.trim());   
    }  
    public void chatAt()  
    {  
        String s="  Mohammad Virat Kohli  ";    
        System.out.println("Searched character = "+s.charAt(11));        
    } 
    public void length()  
    {  
        String s="  Mohammad Virat Kohli  ";    
        System.out.println("Length = "+s.length()); 
    }  
    public void replace()  
    {  
        String s1="  Mohammad Virat Kohli  ";      
        String replaceString=s1.replace("Mohammad","Ali");      
        System.out.println("Replacing Name = "+replaceString);   
    }
    public void appends()
    {  
        StringBuffer sb=new StringBuffer(" Mohammad ");  
        sb.append("Virat Kohli"); 
        System.out.println("Concated String = "+sb);
    }
    public void deletes()
    {  
        StringBuffer sb=new StringBuffer("Mohammad Virat Kohli");  
        sb.delete(1,3);  
        System.out.println("Deleted String = "+sb); 
    }  
    public void reverses()
    {  
        StringBuffer sb=new StringBuffer("Mohammad Virat Kohli");  
        sb.reverse();  
        System.out.println("Reversed String = "+sb); 
    }  
    public void inserts()
    {  
        StringBuffer sb=new StringBuffer("Mohammad ");  
        sb.insert(9,"Virat Kohli"); 
        System.out.println("After Inserting = "+sb);
    }  
}