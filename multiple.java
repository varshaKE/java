interface Walkable 
{
    void walk();
}

interface Swimmable 
{
    void swim();
}

interface quakable 
{
    void quack();
    void cry();
}

class Duck implements Walkable, Swimmable 
{
    public void walk() 
    {
        System.out.println("Duck is walking.");
    }

    public void swim() 
    {
        System.out.println("Duck is swimming.");
    }

   
}

class abc implements quakable 
{
    public void cry() 
    {
        System.out.println("Duck is crying.");
    }

    public void quack() 
    {
        System.out.println("Duck is quacking.");
    }

    public void walk() 
    {
        System.out.println("Duck is walking twice.");
    }

    public void swim() 
    {
        System.out.println("Duck is swimming.");
    }
}

class multiple 
{
    public static void main(String[] args) 
    {
        Duck duck = new Duck();
        abc ob = new abc();

        duck.walk();
        duck.swim();
        ob.cry();
        ob.quack();
        ob.walk();
    }
}
