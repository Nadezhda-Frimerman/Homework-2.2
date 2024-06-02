import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgression,
                      int hardWork, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public String toString() {
        return getName() + " " + " волшебство - " + getMagic() + ", трансгрессия - " + getTransgression()
                + ", трудолюбие - " + getHardWork() + ", верность - " + getLoyalty() + ", честность - " + getHonesty();
    }

    public int hashCode() {
        return Objects.hash(getName(), getMagic(), getTransgression(), hardWork, loyalty, honesty);
    }

    public int sumProperties() {
        return this.hardWork + this.loyalty + this.honesty;
    }

    public void compareByProperties(Hufflepuff a) {
        if (a.sumProperties() > this.sumProperties()) {
            System.out.printf("%s лучший Пуффендуец, чем %s.%n", a.getName(), this.getName());
        } else if (a.sumProperties() < this.sumProperties()) {
            System.out.printf("%s лучший Пуффендуеец, чем %s.%n", this.getName(), a.getName());
        } else {
            System.out.printf("%s и %s одинако хорошие Пуффендуйцы.%n", this.getName(), a.getName());
        }
    }

}
