package petdaycare;

//Modify the code below
public class NinjaCat extends Pet{

    private int stealthLevel;
    public NinjaCat(String name, int age, double baseFee, int stealthLevel){
        super(name, age, baseFee);

        if (stealthLevel < 1 || stealthLevel > 10){
            System.out.println("Error! Stealth Level must be between 1 - 10");
        } else {
            this.stealthLevel = stealthLevel;
        }
    }

    public int GetStealthLevel(){
        return stealthLevel;
    }

    @Override
    public double calculateDailyCost(){
        return baseFee - (stealthLevel * 10);
    }

    @Override
    public void makeSound(){
        System.out.println("...");
    }
    
}

