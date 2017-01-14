import java.util.*;
/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Pet
{
    // instance variables - replace the example below with your own
    private boolean hasStripes;

    
    public Fish(String name, boolean hasStripes,int age, int energy, boolean isHungry)
    {
        super(name,age,energy,isHungry);
        this.hasStripes = hasStripes;
    }
    public Fish(String name, boolean hasStripes) {
        super(name);
        this.hasStripes = hasStripes;
    }
    public void swim(int distance) {
        for(int i = 0; i < distance/4; i++){
            super.action();
        }
    }
    public boolean fight(Fish other){ //this is the messiest method here sry idk spacing
        if(other instanceof Fish) {
            Random gn = new Random();
            if(super.getEnergy()*gn.nextInt(5)+1>((Fish)other).getEnergy()*gn.nextInt(5)+1){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return super.toString() + "\n Has Stripes: " + hasStripes;
    }
}
