package exercises;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Exercise 1: Nicknames
        Nicknames nicknames = new Nicknames();
        nicknames.getNicknames();
        System.out.println("\n");


        // Exercise 2: Abbreviations
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");


        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }
            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("\n");

        // Exercises 3: Print me my hash map
        HashMap<String, String> hashmapExercise3 = new HashMap<>();
        hashmapExercise3.put("f.e", "for example");
        hashmapExercise3.put("etc.", "and so on");
        hashmapExercise3.put("i.e", "more precisely");

        Program.printKeys(hashmapExercise3);
        System.out.println("---");
        Program.printKeysWhere(hashmapExercise3, "i");
        System.out.println("---");
        Program.printValuesOfKeysWhere(hashmapExercise3, ".e");
        System.out.println("\n");

        // Exercise 4: Print me another hash map
        HashMap<String, Book> hashmapExercise4 = new HashMap<>();
        hashmapExercise4.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmapExercise4.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        Program.printValues(hashmapExercise4);
        System.out.println("---");
        Program.printValueIfNameContains(hashmapExercise4, "prejud");
        System.out.println("\n");

        // Exercise 5: I owe you
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
        System.out.println("\n");

        // Exercise 6: Dictionary of many translations
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));

    }
}
