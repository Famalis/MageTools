package spelldice;

/**
 *
 * @author sergi_000
 */
public class Skill extends TestableParameter {

    private Attribute attribute;

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
}
