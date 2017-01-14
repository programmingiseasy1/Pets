
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
    
    private String breed;

    
    public Dog(String name, String breed,int age, int energy, boolean isHungry)
    {
       super(name,age,energy,isHungry);
       this.breed=breed;
    }
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    public void walk(int distance) {
        for(int i = 0; i < distance; i++){
            super.action();
        }
    }
    public void play(int minutes) {
        for(int i = 0; i < minutes/2; i++){
            super.action();
        }
    }
    public String speak() { 
        return "woof";
    }
    public String toString(){
        return super.toString() + "\n Breed: " + breed;
    }

   
}
