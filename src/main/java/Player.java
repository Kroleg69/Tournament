public class Player {
    protected int id;
    protected String name;
    protected int strength;

    public Player(int id, String name, int strenght) {
        this.id = id;
        this.name = name;
        this.strength = strenght;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}
