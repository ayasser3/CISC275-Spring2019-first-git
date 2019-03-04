public class Animal
{
    private String name;
    private int numLegs;
    
    public Animal(String name, int numLegs)
    {
        this.name = name;
        this.numLegs = numLegs;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getLegs()
    {
        return this.numLegs;
    }
    
    public String toString()
    {
        return this.name + " " + this.numLegs;
    }
}