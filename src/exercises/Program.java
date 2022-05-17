package exercises;

import java.util.HashMap;

/**
 * Hashmaps: Exercises 3 & 4
 */

public class Program {

    private HashMap<String,String> hashmap;

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        String searchString = sanitizedString(text);

        for (String abbreviation : hashmap.keySet()) {
            if (abbreviation.contains(searchString)) {
                System.out.println(abbreviation);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        String searchString = sanitizedString(text);

        for (String abbreviation : hashmap.keySet()) {
            if (abbreviation.contains(searchString)) {
                System.out.println(hashmap.get(abbreviation));
            }
        }
    }

    public static void printValues(HashMap<String,Book> hashmap) {
        for (String bookAbbrev : hashmap.keySet()) {
            System.out.println(hashmap.get(bookAbbrev).toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        String searchString = sanitizedString(text);

        for (String bookAbrev : hashmap.keySet()) {
            if (bookAbrev.contains(searchString)) {
                System.out.println(hashmap.get(bookAbrev));
            }
        }
    }

    public static String sanitizedString(String text) {
        if (text == null) {
            return "";
        }

        text = text.toLowerCase();
        return text.trim();
    }

}
