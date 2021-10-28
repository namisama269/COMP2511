package thrones;

public class Game {
    
    public static void main(String[] args) {
        Character king = CharacterFactory.createCharacter("king");
        Character queen = CharacterFactory.createCharacter("queen");
        Character knight = CharacterFactory.createCharacter("knight");
        Character dragon = CharacterFactory.createCharacter("dragon");
    }

}