public class FirePokemon extends Pokemon{
    private final String element;
    private final String weakness;
    private String fuel;
    private int maxTemp;

    public FirePokemon(String name, int level, int xp, int dateCaught, String fuel, int maxTemp) {
        super(name, level, xp, dateCaught);
        element = "Fire";
        weakness = "Water";
        this.fuel = fuel;
        this.maxTemp = maxTemp;
    }

    // ------------------------ GETTERS

    public String getElement() {
        return element;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getFuel() {
        return fuel;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    // -------------------- SETTERS

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    // ---------------------- METHODS

    public void fireLash(){
        System.out.println("vuur pas op au au");
    }

    public void flameThrower(){
        System.out.println("ik gooi vuur; VANG!");
    }

    public void speaks(){
        System.out.println("WOOSH WOOSH");
    }

}
