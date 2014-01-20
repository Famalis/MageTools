package magerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergi_000
 */
public class Mage implements Serializable{

    //Map<String, Integer> spheres = new HashMap<>();\
    List<Integer> sphereList = new ArrayList<>();
    static String[] sphereNames = {"Czas", "Duch", "Entropia", "Korespondencja",
        "Materia", "Pierwsza", "Siły", "Umysł", "Życie"};
    Integer arete;
    
    public Mage() {
        
        for (int i = 0; i<9 ;i++) {
            sphereList.add(0);
        }
        /*
        spheres.put("Czas", 0);
        spheres.put("Duch", 0);
        spheres.put("Entropia", 0);
        spheres.put("Korespondencja", 0);
        spheres.put("Materia", 0);
        spheres.put("Pierwsza", 0);
        spheres.put("Siły", 0);
        spheres.put("Umysł", 0);
        spheres.put("Życie", 0);
        * */
        
        arete = 1;
    }
}
