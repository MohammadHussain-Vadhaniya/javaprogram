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
    public static void main(String ar[])  
    {  
        String s1="  Mohammad Virat Kohli  ";      
        String replaceString=s1.replace("Mohammad","Ali");//replaces all occurrences of "Java" to "Kava"      
        System.out.println(replaceString);   
    }