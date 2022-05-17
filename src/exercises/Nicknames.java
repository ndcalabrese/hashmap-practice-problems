package exercises;

import java.util.HashMap;

/**
 * Hashmaps: Exercise 1
 */

public class Nicknames {

    private HashMap<String,String> hashmap;

    public Nicknames() {
        this.hashmap = new HashMap<>();
        hashmap.put("matthew", "matt");
        hashmap.put("michael", "mix");
        hashmap.put("arthur", "artie");
    }
    public void getNicknames() {
        System.out.println(hashmap.get("matthew"));
    }
}
