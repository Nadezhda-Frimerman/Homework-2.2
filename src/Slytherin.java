import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determined;
    private int ambitions;
    private int resourcefulness;
    private int powerHungry;


    public Slytherin(String name, int magic, int transgression,
                     int cunning, int determined, int ambitions, int
                             resourcefulness, int powerHungry) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determined = determined;
        this.ambitions = ambitions;
        this.resourcefulness = resourcefulness;
        this.powerHungry = powerHungry;
    }

    public int getPowerHungry() {
        return powerHungry;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public int getDetermined() {
        return determined;
    }

    public int getCunning() {
        return cunning;
    }

    public String toString() {
        return getName() + " " + " волшебство - " + getMagic() + ", трансгрессия - " + getTransgression()
                + ", хитрость - " + getCunning() + ", решительность - " + getDetermined() + ", амбициозность - " + getAmbitions()
                + ", находчивость - " + getResourcefulness() + ", жажда власти - " + getPowerHungry();
    }

    public int hashCode() {
        return Objects.hash(getName(), getMagic(), getTransgression(), cunning, determined, ambitions, resourcefulness, powerHungry);
    }

    public int sumProperties() {
        return this.cunning + this.determined + this.ambitions + this.resourcefulness + this.powerHungry;
    }

    public void compareByProperties(Slytherin a) {
        if (a.sumProperties() > this.sumProperties()) {
            System.out.printf("%s лучший Слизеринец, чем %s.%n", a.getName(), this.getName());
        } else if (a.sumProperties() < this.sumProperties()) {
            System.out.printf("%s лучший Слизеринец, чем %s.%n", this.getName(), a.getName());
        } else {
            System.out.printf("%s и %s одинако хорошие Слизеринцы.%n", this.getName(), a.getName());
        }
    }

}
