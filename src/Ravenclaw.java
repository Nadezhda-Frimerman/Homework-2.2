import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String name, int magic, int transgression,
                     int intelligence, int wisdom, int wit, int
                             creative) {
        super(name, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getCreative() {
        return creative;
    }

    public int getWit() {
        return wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public String toString() {
        return getName() + " " + " волшебство - " + getMagic() + ", трансгрессия - " + getTransgression()
                + ", ум - " + getIntelligence() + ", мудрость - " + getWisdom() + ", остроумие - " + getWit()
                + ", творчество - " + getCreative();
    }

    public int hashCode() {
        return Objects.hash(getName(), getMagic(), getTransgression(), intelligence, wisdom, wit, creative);
    }

    public int sumProperties() {
        return this.intelligence + this.wisdom + this.wit + this.creative;
    }

    public void compareByProperties(Ravenclaw a) {
        if (a.sumProperties() > this.sumProperties()) {
            System.out.printf("%s лучший Кргтевранец, чем %s.%n", a.getName(), this.getName());
        } else if (a.sumProperties() < this.sumProperties()) {
            System.out.printf("%s лучший Когтевранец, чем %s.%n", this.getName(), a.getName());
        } else {
            System.out.printf("%s и %s одинако хорошие Когтевранцы.%n", this.getName(), a.getName());
        }
    }
}



