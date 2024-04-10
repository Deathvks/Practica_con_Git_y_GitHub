import java.util.HashSet;
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona{
    private HashSet<String> hobbies;
    
    private String nombre;
    
    public Persona(String nombre){
        hobbies = new HashSet<>();
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void addHobby(String h){
        if(!hobbies.contains(h)){
            hobbies.add(h.toLowerCase());
        }
    }
    
    public boolean tieneHobby(String h){
        if(hobbies.contains(h.toLowerCase()))
            return true;
        
        return false;
    }
    
    public String hobbiesToString(){
        return "Hobbies: " + hobbies;
    }
    
    public String toString(){
        return "Nombre: " + getNombre() + "Hobbies: " + hobbies;
    }
}
