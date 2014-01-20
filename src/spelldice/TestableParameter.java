/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spelldice;

/**
 * All stuff like attributes, skills, spheres;
 * @author Sergio
 */
public class TestableParameter {
    
    protected String name;
    protected Integer level;
    
    public TestableParameter() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
