class Animal
{
    void Eatanimal()
    {
        System.out.println("Eating");
    }
}
class Methodoverriding extends Animal
{
    void Eatanimal()
    {
        System.out.println("Nonveg");
    }
    public static void main(String[] args)
    {
        Methodoverriding MO = new Methodoverriding();
        Animal AN = new Animal();
        MO.Eatanimal();
        AN.Eatanimal();
    }
}