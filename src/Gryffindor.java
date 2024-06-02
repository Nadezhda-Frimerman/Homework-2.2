import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magic, int transgression,
                      int nobility, int honor,int courage) {
        super(name, magic, transgression);
        this.nobility=nobility;
        this.honor=honor;
        this.courage=courage;
    }

    public int getCourage() {
        return courage;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }
    public String toString() {
        return getName()+" "+" волшебство - "+getMagic()+", трансгрессия - "+getTransgression()
                +", благородство - "+getNobility()+", честь - "+getHonor()+", храбрость - "+getCourage();
    }
    public int hashCode(){
        return Objects.hash (getName(),getMagic(), getTransgression(),nobility,honor,courage);
    }
    public int sumProperties(){
        return this.nobility +this.honor+this.courage;
    }

    public void compareByProperties(Gryffindor a) {
        if (a.sumProperties() > this.sumProperties()) {
            System.out.printf("%s лучший Гриффиндорец, чем %s.%n", a.getName(), this.getName());
        }
        else if (a.sumProperties() < this.sumProperties()){
            System.out.printf("%s лучший Гриффиндорец, чем %s.%n", this.getName(), a.getName());
        }
        else {
            System.out.printf("%s и %s одинако хорошие Гриффиндорцы.%n", this.getName(), a.getName());
        }
    }

}
