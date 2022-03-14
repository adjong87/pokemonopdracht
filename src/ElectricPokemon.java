public class ElectricPokemon extends Pokemon{
    private final String element = "Electric";
    private final String weakness = "Water";
    private boolean heatProof;
    private int voltage;

    public ElectricPokemon(String name, int level, int xp, int dateCaught, boolean heatProof, int voltage) {
        super(name, level, xp, dateCaught);
        this.heatProof = heatProof;
        this.voltage = voltage;
    }

    // ------------------------- GETTERS

    public String getElement() {
        return element;
    }

    public String getWeakness() {
        return weakness;
    }

    public boolean isHeatProof() {
        return heatProof;
    }

    public int getVoltage() {
        return voltage;
    }

    // ---------------------- SETTERS

    public void setHeatProof(boolean heatProof) {
        this.heatProof = heatProof;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    // -------------------- METHODS

    public void electroBall(){
        System.out.println("Ik gooi een bal batterijen naar je hoofd");
    }

    public void thunder(){
        System.out.println("Kijk mij bliksemen");
    }

    public void speaks(){
        System.out.println("Buzzin'");
    }
}
