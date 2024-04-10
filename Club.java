import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/**
 * Write a description of class Club here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club{
    ArrayList<Persona> listaPersonas;
    
    public Club(){
        listaPersonas = new ArrayList<>();
    }
    
    public void addPersona(String nombre, HashSet<String> hob){
        Iterator<String> iter = hob.iterator();
        Persona p = new Persona(nombre);
        while(iter.hasNext()){
            p.addHobby(iter.next());
        }
        listaPersonas.add(p);
    }
    
    public int personasConHobby(String cual){
        Iterator<Persona> iter = listaPersonas.iterator();
        int cont = 0;
        if(iter.next().tieneHobby(cual)){
            cont++;
        }
        return cont;
    }
    
    public void printClub(){
        for(Persona i: listaPersonas){
            System.out.print("Lista Personas:" + i);
        }
    }
    
    public HashSet<String> borrarPersonasConHobby(String cual){
        Iterator<Persona> iter = listaPersonas.iterator();
        HashSet<String> borrados = new HashSet<>();
        
        while(iter.hasNext()){
            Persona p = iter.next();
            if(iter.next().tieneHobby(cual)){
                borrados.add(p.getNombre());
                iter.remove();
            }
        }
        return borrados;
    }
}
