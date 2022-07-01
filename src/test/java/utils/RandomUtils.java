package utils;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class RandomUtils {

    public static int getRandomInt(int min, int max) {
        Random r = new Random();

        return r.nextInt((max - min) + 1) + min;
    }

    public static String getRandomGender() {
        var random = new SecureRandom();
        var list = Arrays.asList("Male", "Female", "Other");

        return list.get(random.nextInt(list.size()));
    }

    public static String getRandomMonth() {
        var random = new SecureRandom();
        var list = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        return list.get(random.nextInt(list.size()));
    }

    public static String getRandomSubject() {
        var random = new SecureRandom();
        var list = Arrays.asList("English", "Maths", "Physics");

        return list.get(random.nextInt(list.size()));
    }

    public static String getRandomHobbie() {
        var random = new SecureRandom();
        var list = Arrays.asList("Sports", "Reading", "Music");

        return list.get(random.nextInt(list.size()));
    }

}
