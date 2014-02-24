package spelldice;

import java.util.Arrays;

/**
 *
 * @author sergi_000
 */
public class Mechanics {

    public Mechanics() {
        super();
    }

    public Result skillTest(Integer level, Integer required, Integer difficulty) {
        int counter = 0;
        Result result = new Result();
        for (int i = 0; i < level; i++) {
            double ran = Math.random() * 10 + 1;
            result.data += (int) ran + ", ";
            if (ran >= difficulty) {
                counter++;
            } else if (ran <= 1) {
                counter--;
            }
        }
        result.numOfSucceses = counter;
        result.success = counter >= required ? true : false;
        result.data += "\nNumber of successes: " + counter;
        result.data += "\nResult: " + (result.success ? "Success" : "Failure");

        return result;
    }

    public Result attributeTest(Integer level, Integer required, Integer ST) {
        int counter = 0;
        Result result = new Result();
        for (int i = 0; i < level; i++) {
            double ran = Math.random() * 10 + 1;
            result.data += (int) ran + ", ";
            if (ran >= ST) {
                counter++;
            } else if (ran <= 1) {
                counter--;
            }
        }
        result.numOfSucceses = counter;
        result.success = counter >= required ? true : false;
        result.data += "\nNumber of successes: " + counter + "/" + required;
        result.data += "\nResult: " + (result.success ? "Success" : "Failure");

        return result;
    }
    /*
     private int magicTest(int successCounter, SpellResult result, int[] results) {
     int ran = (int) (Math.random() * 10 + 1);
     result.data += ran + ", ";
     results[i] = ran;
     if (ran >= ST) {
     successCounter++;
     } else if (ran <= 1) {
     successCounter--;
     }
        
     if (successCounter < 0) {
     if (spellCast.situation == SpellCast.VULGAR_WITH_OBSERVER) {
     result.paradox = spellCast.maxSphere + 2 * (spellCast.situation - 3);
     } else {
     result.paradox = spellCast.maxSphere + (spellCast.situation - 3);
     }
     }
     }
     */

    public SpellResult spellTest(SpellCast spellCast, Integer arete, Integer modifier) {
        int successCounter = 0;
        int ST = spellCast.maxSphere + spellCast.situation + modifier - spellCast.essence;
        int required = spellCast.requiredSuccesses;
        int[] results = new int[arete];
        SpellResult result = new SpellResult();
        for (int i = 0; i < arete; i++) {
            int ran = (int) (Math.random() * 10 + 1);
            //result.data += ran + ", ";
            results[i] = ran;
            if (ran >= ST) {
                successCounter++;
            } else if (ran <= 1) {
                successCounter--;
            }
        }
        Arrays.sort(results);
        result.data += Arrays.toString(results);
        if (successCounter < 0) {
            if (spellCast.situation == SpellCast.VULGAR_WITH_OBSERVER) {
                result.paradox = spellCast.maxSphere + 2 * (spellCast.situation - 3);
            } else {
                result.paradox = spellCast.maxSphere + (spellCast.situation - 3);
            }
        }
        if (spellCast.situation == SpellCast.VULGAR_WITH_OBSERVER) {
            result.paradox++;
        }
        if (spellCast.will) {
            successCounter++;
        }                
        result.success = successCounter >= required ? true : false;
        if (spellCast.destiny > 0) {
            result.data += " destiny rolls: ";
            for (int i = 0; i < spellCast.destiny; i++) {
                if (results[i] >= ST) {
                    break;
                } else {
                    int ran = (int) (Math.random() * 10 + 1);
                    result.data += "["+results[i]+ "] to "+ran + ", ";
                    results[i] = ran;
                    if (ran >= ST) {
                        successCounter++;
                    } else if (ran <= 1) {
                        successCounter--;
                    }
                    if (successCounter < 0) {
                        if (spellCast.situation == SpellCast.VULGAR_WITH_OBSERVER) {
                            result.paradox = spellCast.maxSphere + 2 * (spellCast.situation - 3);
                        } else {
                            result.paradox = spellCast.maxSphere + (spellCast.situation - 3);
                        }
                    }
                }
            }
        }
        result.numOfSucceses = successCounter;
        result.data += "\nDifficulty (" + ST + ") = Max Sphere (" + spellCast.maxSphere + ")  "
                + "+ Situation (" + spellCast.situation + ") "
                + "+ Extra modifier (" + modifier + ") "
                + "+ Essence (-" + spellCast.essence + ")";
        result.data += "\nNumber of successes: " + successCounter + "/" + required;
        if (spellCast.will) {
            result.data += " (+ Will)";
        }
        result.data += "\nResult: " + (result.success ? "Success" : "Failure");
        result.data += "\nParadox: " + result.paradox;
        return result;
    }
}
