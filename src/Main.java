public class Main {
    public static void main(String[] args) {

    ElectricPokemon pikachu = new ElectricPokemon("Pika", 1, 50, 14032022, true, 220);
    FirePokemon charizard = new FirePokemon("Chari", 10, 250, 11032022, "diesel", 666);

    pikachu.speaks();
    charizard.speaks();

    pikachu.thunder();
    charizard.flameThrower();

    }
}
