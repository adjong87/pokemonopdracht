public abstract class Pokemon {
    private String name;
    private int level;
    private int xp;
    private int dateCaught;

    public Pokemon(String name, int level, int xp, int dateCaught){
        this.name=name;
        this.level=level;
        this.xp = xp;
        this.dateCaught = dateCaught;
    }

    // ----------------------------- GETTERS

     public String getName(){
        return name;
     }

     public int getLevel(){
        return level;
     }

     public int getXp(){
        return xp;
     }

     public int getDateCaught() {
         return dateCaught;
     }

     // --------------------------- SETTERS

    public void setName(String newName) {
        newName = name;
    }

    public void setLevel(int newLevel){
        newLevel = level;
    }

    public void setXP(int newXp){
        newXp = xp;
    }

    public void setDateCaught(int newDateCaught){
        newDateCaught = dateCaught;
    }

    // --------------------------- METHODS

    public void eats(){
        System.out.println("Yum yum");
    }

    public void speaks(){
        System.out.println("Hoi Hoi");
    }

    public abstract flameThrower() {

    }

}
