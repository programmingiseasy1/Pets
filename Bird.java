import java.util.*;
/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Pet
{
    
    private String color;
    ArrayList<String> vocabulary = new ArrayList<String>();
    int counter = 0;

    public Bird(String name, String color,int age, int energy, boolean isHungry)
    {
        super(name,age,energy,isHungry);
        this.color = color;
    }
    public Bird(String name, String color) {
        super(name);
        this.color = color;
    }
    public void fly(int distance) {
        for(int i = 0; i < distance/2; i++){
            super.action();
        }
    }
    public void teachWord(String word){
        vocabulary.add(word);
    }
    public String recite() {
        return Arrays.toString(vocabulary.toArray());
    }
    public String speak() { 
        return "chirp";
    }
    public String toString(){
        return super.toString() + "\n Color: " + color;
    }

    
}
