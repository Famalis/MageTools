package model;

import java.util.List;

/**
 *
 * @author sergi_000
 */
public class Character {

    private List<Attribute> attributes;
    private List<Skill> skills;
    
    public Character() {
        super();
        attributes.add(new Attribute("Siła", 1));
        attributes.add(new Attribute("Zręczność", 1));
        attributes.add(new Attribute("Wytrzymałość", 1));
        attributes.add(new Attribute("Charyzma", 1));
        attributes.add(new Attribute("Oddziaływanie", 1));
        attributes.add(new Attribute("Wygląd", 1));
        attributes.add(new Attribute("Percepcja", 1));
        attributes.add(new Attribute("Inteligencja", 1));
        attributes.add(new Attribute("Spryt", 1));
    }
}
