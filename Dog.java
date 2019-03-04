public class Dog extends Animal
{
    private String name;
    private int numLegs;
    
    public Dog(String name, int numLegs)
    {
        super(name, numLegs);
    }
    
    public String getName()
    {
        return super.getName();
    }
    
    public int getLegs()
    {
        return super.getLegs();
    }
    
    public String toString()
    {
        return super.toString();
    }
}