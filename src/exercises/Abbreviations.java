package exercises;

import java.util.HashMap;

/**
 * Hashmaps: Exercise 2
 */

public class Abbreviations {

    private HashMap<String, String> hashmap;

    public Abbreviations() {
        hashmap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        hashmap.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation) {
        return hashmap.get(abbreviation) != null;
    }
    public String findExplanationFor(String abbreviation) {
        return hashmap.get(abbreviation);
    }

}
