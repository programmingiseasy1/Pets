
/**
 * Write a description of class Pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pet
{
    
    private String name;
    private int age;
    private int energy;
    private boolean isHungry;

    
    public Pet(String name,int age, int energy, boolean isHungry)
    {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.isHungry = isHungry;
    }
    public Pet(String Name)
    {
        this.age = 10;
        this.energy = 100;
        this.isHungry = true;
    }
    public void sleep() {
        energy += 20;
    }
    public void action() {
        energy -= 10;
    }
    public void eat() {
        if(isHungry){
            isHungry = false;
        }
    }
    public int getEnergy(){
        return energy;
    }
    public String speak() {
        return "";
    }
    public String toString() {
        return "Name: " + name + "\n Age: " + age + "\n Energy: " + energy + "\n isHungry: " + isHungry;
    }

    
}
