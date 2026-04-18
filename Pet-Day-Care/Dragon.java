package petdaycare;

//Modify the code below
public class Dragon extends Pet{

    private int fireBreathIntensity;
    public Dragon(String name, int age, double baseFee, int fireBreathIntensity){
        super(name, age, baseFee);

        if (fireBreathIntensity < 1 || fireBreathIntensity > 10){
            System.out.println("Error! Fire Breath Intensity must be a value between 0 - 10");
        } else {
            this.fireBreathIntensity = fireBreathIntensity;
        }
        
    }

    public int getFireBreathInensity(){
        return fireBreathIntensity;
    }

    @Override
    public double calculateDailyCost(){
        return baseFee + (fireBreathIntensity * 50);
    }

    @Override
    public void makeSound(){
        System.out.println("ROAAAAR! 🔥");
    }


}
