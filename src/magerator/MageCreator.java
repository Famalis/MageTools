package magerator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergi_000
 */
public class MageCreator {

    final public Mage generateMage(int spherePoints, int arete) {
        
        int max = arete>5 ? 5 : arete;
        Mage m = new Mage();
        spherePoints+=6;
        if(arete == 0) {
            arete = 1;
        } else if(max*9<spherePoints ) {
            spherePoints=max*9;
        }
        //System.out.println(spherePoints);
        m.arete = arete;
        List<Long> usedSpheres = new ArrayList<>();
        while(spherePoints>0) {
            Long randomIndex = Math.round(Math.random()*8);
            if(usedSpheres.contains(randomIndex)) {
                int tmpIndex = randomIndex.intValue();
                while(m.sphereList.get(tmpIndex)==5) {
                    randomIndex = Math.round(Math.random()*8);
                    tmpIndex = randomIndex.intValue();
                }
            }
            usedSpheres.add(randomIndex);
            Long randomValue = 1000L;
            while(randomValue>arete) {
                randomValue = Math.round(Math.random()*spherePoints);
                //System.out.println("inner loop "+randomIndex+" "+randomValue);
            }
            int index = randomIndex.intValue();
            int value = randomValue.intValue();
            if(m.sphereList.get(index)>0) {                
                if(m.sphereList.get(index)+value>max) {
                    int diff = max - m.sphereList.get(index);
                    spherePoints -= diff;
                    value = diff;
                    m.sphereList.set(index, 
                            m.sphereList.get(index)+value);
                } else {
                    m.sphereList.set(index, 
                            m.sphereList.get(index)+value);
                    spherePoints -= value;
                }
            } else {
                m.sphereList.set(index, value);
                spherePoints -= randomValue;
            }
            System.out.println(Mage.sphereNames[index]+" is now "+m.sphereList.get(index));
            System.out.println(spherePoints+" sphere points remaining");
            
            
        }
        
        System.out.println("Loops ended");
        return m;
        
    }
    
    final public String getMageString(int spherePoints, int arete) {
        Mage m = this.generateMage(spherePoints, arete);
        
        String result = "";
        result+="Arete: "+m.arete+"\n";
        for (int i = 0; i<9; i++) {
            result+=Mage.sphereNames[i]+": "+m.sphereList.get(i)+"\n";
        }
        
        return result;
    }
}
