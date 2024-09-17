abstract class Animal
{
    abstract void dog();
    public void cat()
    {
        System.out.println("MEOW MEOW MEOW...");
    }
}
class Dog extends Animal
{
    void dog()
    {
        System.out.println("BARK BARK BARK...");
    }
}
class Abstractclass extends Dog
{
    
    public static void main(String[] args)
    {
        Abstractclass ac = new Abstractclass();
        ac.cat();
        ac.dog();
    }
}
   