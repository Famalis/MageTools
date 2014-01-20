package spelldice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sergi_000
 */
public class CharacterSheet implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private List<Attribute> attributes = new ArrayList<>();;
    private List<Skill> skills = new ArrayList<>();
    private Map<String, Integer> spheres = new HashMap<>();
    private Integer arete = 1;
    private Integer paradox = 0;
    private String name = "Bohater";

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
    
    public final Attribute getAttrByName(String name) {
        for (Attribute a : attributes) {
            if(name.equals(a.getName())) {
                return a;
            }
        }
        
        return null;
    }
    
    public final Skill getSkillByName(String name) {
        for (Skill a : skills) {
            if(name.equals(a.getName())) {
                return a;
            }
        }
        return null;
    }

    public Map<String, Integer> getSpheres() {
        return spheres;
    }

    public void setSpheres(Map<String, Integer> spheres) {
        this.spheres = spheres;
    }

    public Integer getArete() {
        return arete;
    }

    public void setArete(Integer arete) {
        this.arete = arete;
    }

    public Integer getParadox() {
        return paradox;
    }

    public void setParadox(Integer paradox) {
        this.paradox = paradox;
    }
    
    
    public CharacterSheet() {
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
        
        //Talenty
        skills.add(new Skill(this.getAttrByName("Siła"),"Bójka", 0));
        skills.add(new Skill(this.getAttrByName("Spryt"), "Cwaniactwo", 0));
        skills.add(new Skill(this.getAttrByName("Percepcja"), "Czujność", 0));
        skills.add(new Skill(this.getAttrByName("Oddziaływanie"), "Ekspresja", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Instruktaż", 0));
        skills.add(new Skill(this.getAttrByName("Spryt"), "Intuicja", 0));
        skills.add(new Skill(this.getAttrByName("Spryt"), "Przebiegłość", 0));
        skills.add(new Skill(this.getAttrByName("Percepcja"), "Świadomość", 0));
        skills.add(new Skill(this.getAttrByName("Zręczność"), "Uniki", 0));
        skills.add(new Skill(this.getAttrByName("Wytrzymałość"), "Wysportowanie", 0));
        skills.add(new Skill(this.getAttrByName("Oddziaływanie"), "Zastraszanie", 0));
        
        //Umiejętności
        skills.add(new Skill(this.getAttrByName("Charyzma"),"Autorytet", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Badania", 0));
        skills.add(new Skill(this.getAttrByName("Percepcja"), "Broń Palna", 0));
        skills.add(new Skill(this.getAttrByName("Zręczność"), "Do", 0));
        skills.add(new Skill(this.getAttrByName("Oddziaływanie"), "Etykieta", 0));
        skills.add(new Skill(this.getAttrByName("Zręczność"), "Krycie się", 0));
        skills.add(new Skill(this.getAttrByName("Wytrzymałość"), "Medytacja", 0));
        skills.add(new Skill(this.getAttrByName("Zręczność"), "Prowadzenie", 0));
        skills.add(new Skill(this.getAttrByName("Spryt"), "Sztuka Przetrwania", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Technologia", 0));
        skills.add(new Skill(this.getAttrByName("Siła"), "Walka Wręcz", 0));
        
        //Wiedza
        skills.add(new Skill(this.getAttrByName("Inteligencja"),"Informatyka", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Kosmologia", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Kultury", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Lingwistyka", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Medycyna", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Nauka", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Okultyzm", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Prawo", 0));
        skills.add(new Skill(this.getAttrByName("Spryt"), "Śledztwo", 0));
        skills.add(new Skill(this.getAttrByName("Inteligencja"), "Zagadki", 0));
        skills.add(new Skill(this.getAttrByName("Spryt"), "Znajomość", 0));
        
        //Magia
        spheres.put("Czas", 0);
        spheres.put("Duch", 0);
        spheres.put("Entropia", 0);
        spheres.put("Korsepondencja", 0);
        spheres.put("Materia", 0);
        spheres.put("Pierwsza", 0);
        spheres.put("Siły", 0);
        spheres.put("Umysł", 0);
        spheres.put("Życie", 0);
        
    }
}
