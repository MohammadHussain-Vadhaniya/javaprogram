public class Mathfunction {
    public static void main(String[] args)
    {
        double a = 28,b = 4;    
        System.out.println("Maximum number from A and B is "+Math.max(a,b));

        System.out.println("Minimum number from A and B is "+Math.min(a,b));

        System.out.println("Absolute number of A is "+Math.abs(20.10000));

        System.out.println("Square root number of B is "+Math.sqrt(b));

        System.out.println("Random number is "+((int)(Math.random() * 101)));
         
        System.out.println("Exp of a is: " +Math.exp(a));
     
        System.out.println("Power of x and y is: " + Math.pow(a, b));  

        System.out.println("log10 of x is: " + Math.log10(a));  

        System.out.println("log1p of x is: " +Math.log1p(a));   

        System.out.println("Sine value of a is: " +Math.asin(a));  

    }
}
