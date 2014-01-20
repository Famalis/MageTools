/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spelldice;

/**
 *
 * @author Sergio
 */
public class SpellCast {
    
    public static Integer ACCIDENTAL = 3, VULGAR = 4, VULGAR_WITH_OBSERVER = 5;
    
    public Integer maxSphere;
    public Integer st;
    public Integer modifier;
    public Integer requiredSuccesses;
    public Integer situation;
    public boolean vulgarWithObs = false;
    public Integer essence = 0;
    public boolean will = false;
    
    public SpellCast() {
        
    }
    
    public void setSpellSituation(Integer maxSphere, Integer situation) {
        this.maxSphere = maxSphere;
        this.situation = situation;
        this.st = maxSphere + situation;
    }
    
}
