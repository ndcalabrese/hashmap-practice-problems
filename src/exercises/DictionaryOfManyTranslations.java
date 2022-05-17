package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Hashmaps: Exercise 6
 */

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> hashmap;
    public DictionaryOfManyTranslations() {
        hashmap = new HashMap<>();
    }

    public void add(String word, String translation) {
        ArrayList<String> translations = new ArrayList<>();
       // if key does not exist, add one
        if (!hashmap.containsKey(word)) {
            translations.add(translation);
            hashmap.put(word, translations);
        } else {
            hashmap.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> translations = new ArrayList<>();
        if (!(hashmap.get(word) == null)) {
            translations = hashmap.get(word);
        }
        return translations;
    }

    public void remove(String word) {
        hashmap.remove(word);
    }

}


