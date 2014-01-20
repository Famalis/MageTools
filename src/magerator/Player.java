/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Sergio
 */
public class Player extends Mage{
    
    private static final long serialVersionUID = 1L;
    
    private static Map<String, Player> persistance = new HashMap<String, Player>();
    private static String filePath = "players.obj";    
    
    private String name;
    private String description;
    
    public Player() {
        super();
    }

    public static Map<String, Player> getPersistance() {
        return persistance;
    }

    public static void setPersistance(Map<String, Player> persistance) {
        Player.persistance = persistance;
    }
    
    public static void savePlayer(Player p) {
        persistance.put(p.getName(), p);
        Save();
    }
    
    public static void Save() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File file = null;
        try {
            file = new File(filePath);
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(persistance);
            oos.close();
            fos.close();            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void Load() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File file = null;
        try {
            file = new File(filePath);
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            persistance = (Map<String, Player>) ois.readObject();
            ois.close();
            fis.close();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getSphereList() {
        return sphereList;
    }

    public void setSphereList(List<Integer> sphereList) {
        this.sphereList = sphereList;
    }

    public static String[] getSphereNames() {
        return sphereNames;
    }

    public static void setSphereNames(String[] sphereNames) {
        Mage.sphereNames = sphereNames;
    }

    public Integer getArete() {
        return arete;
    }

    public void setArete(Integer arete) {
        this.arete = arete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
