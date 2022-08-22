package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String s = String.valueOf(character);

        if (s.matches("[aeiouy]")) {
            System.out.println("Vowel");
        } else if (s.matches("[A-Za-z]")) {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}

