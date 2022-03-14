public class GrassPokemon extends Pokemon{
    private final String element;
    private final String weakness;
    private boolean confused;
    private boolean smokes;

    public GrassPokemon(String name, int level, int xp, int dateCaught, boolean confused, boolean smokes) {
        super(name, level, xp, dateCaught);
        element = "Grass";
        weakness = "Fire";
        this.confused = confused;
        this.smokes = smokes;
    }

    // --------------------- GETTERS

    public String getElement() {
        return element;
    }

    public String getWeakness() {
        return weakness;
    }

    public boolean isConfused() {
        return confused;
    }

    public boolean isSmokes() {
        return smokes;
    }

    // -------------------- SETTERS


    public void setConfused(boolean confused) {
        this.confused = confused;
    }

    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    // -------------------- METHODS

    public void leafStorm(){
        System.out.println("Ik rook geen blaadjes, daarvan krijg je hoofdpijn");
    }

    public void leechSeed(){
        System.out.println("Ik pak jouw zaadjes af");
    }
}

