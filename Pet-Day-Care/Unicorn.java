package petdaycare;

//Modify the code below
public class Unicorn extends Pet{
    
    private int glitterLevel;
    public Unicorn(String name, int age, double baseFee, int glitterLevel){
        super(name, age, baseFee);
        
        if (glitterLevel < 1 || glitterLevel > 5){
            System.out.println("Error! Glitter Level must be between 1 - 5");
        } else {
            this.glitterLevel = glitterLevel;
        }
    }

    public int getGlitterLevel(){
        return glitterLevel;
    }

    @Override
    public double calculateDailyCost(){
        return baseFee + (glitterLevel * 30);
    }

    @Override
    public void makeSound(){
        System.out.println("Neigh... ✨sparkle sparkle✨");
    }

}

