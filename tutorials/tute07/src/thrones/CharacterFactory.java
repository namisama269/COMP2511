package thrones;

import java.util.Random;

public class CharacterFactory {
    private static Random random = new Random(System.currentTimeMillis());

    public static Character createCharacter(String type) {
        switch(type) {
            case "knight":
                return new Knight(random.nextInt(5), random.nextInt(5));
            case "queen":
                return new Queen(random.nextInt(5), random.nextInt(5));
            case "dragon":
                return new Dragon(random.nextInt(5), random.nextInt(5));
            case "king":
                return new King(random.nextInt(5), random.nextInt(5));
        }

        return null;
    }
}
