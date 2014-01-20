package model;

/**
 *
 * @author sergi_000
 */
public class Attribute {
    
    private String name;
    private Integer level;
    
    public Attribute() {
        super();
    }
    
    public Attribute(String name, Integer level) {
        super();
        this.level = level;
        this.name = name;
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
    
    
}
