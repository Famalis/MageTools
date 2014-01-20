package magerator;

/**
 *
 * @author sergi_000
 */
public class Main {
    
    public static void main(String[] args) {
        MageCreator mc = new MageCreator();
        Mage m = mc.generateMage(3, 5);
        
        for (int i = 0; i<9 ;i++) {
            System.out.println(Mage.sphereNames[i]+" "+m.sphereList.get(i));
        }
    }

}
