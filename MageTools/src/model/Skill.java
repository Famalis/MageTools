package model;

/**
 *
 * @author sergi_000
 */
public class Skill {

    private Attribute attribute;
    private String name;
    private Integer level;
    
    public Skill(Attribute a, String name, Integer level) {
        super();
        this.attribute = a;
        this.level = level;
        this.name = name;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
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
