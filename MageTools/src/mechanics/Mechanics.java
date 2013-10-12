package mechanics;

import model.Attribute;
import model.Result;
import model.Skill;

/**
 *
 * @author sergi_000
 */
public class Mechanics {
    
    public Mechanics() {
        super();
    }
    
    public Result skillTest(Skill skill, Integer required, Integer difficulty) {
        int counter = 0;
        Result result = new Result();
        for (int i = 0; i<skill.getLevel()+skill.getAttribute().getLevel(); i++) {
            double ran = Math.random()*10+1;
            result.data += (int)ran+", ";
            if(ran>=difficulty) {
                counter++;
            } else if(ran<=1) {
                counter--;
            }
        }
        result.numOfSucceses = counter;
        result.success = counter>=required ? true : false;
        result.data+="\nNumber of successes: "+counter;
        result.data+="\nResult: "+result.success;
        
        return result;
    }
    
    public Result skillTest(Attribute skill, Integer required, Integer difficulty) {
        int counter = 0;
        Result result = new Result();
        for (int i = 0; i<skill.getLevel(); i++) {
            double ran = Math.random()*10+1;
            result.data += (int)ran+", ";
            if(ran>=difficulty) {
                counter++;
            } else if(ran<=1) {
                counter--;
            }
        }
        result.numOfSucceses = counter;
        result.success = counter>=required ? true : false;
        result.data+="\nNumber of successes: "+counter;
        result.data+="\nResult: "+result.success;
        
        return result;
    }
    
    
}
