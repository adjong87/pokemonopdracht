public class WaterPokemon extends Pokemon {
    private final String element;
    private final String weakness;
    private boolean asleep;
    private String flavor;

    public WaterPokemon(String name, int level, int xp, int dateCaught, boolean asleep, String flavor) {
        super(name, level, xp, dateCaught);
        element = "Water";
        weakness = "Grass";
        this.asleep = asleep;
        this.flavor = flavor;
    }

    // -------------------- GETTERS

    public String getElement() {
        return element;
    }

    public String getWeakness() {
        return weakness;
    }

    public boolean isAsleep() {
        return asleep;
    }

    public String getFlavor() {
        return flavor;
    }

    // ------------------ SETTERS


    public void setAsleep(boolean asleep) {
        this.asleep = asleep;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // ------------------ METHODS

    public void hydroCanon(){
        System.out.println("Lekker natgespetterd door mijn kanon");
    }

    public void rainDance(){
        System.out.println("Ik dans lekker in de regen, niet omdat het moet, maar omdat ik dat kan");
    }

    public void speaks() {
        System.out.println("Plons");
    }
}
