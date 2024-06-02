import java.util.Objects;

public class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getTransgression() {
        return transgression;
    }

    public int getMagic() {
        return magic;
    }
    public String toString() {
        return getName()+" волшебство - "+getMagic()+" трансгрессия - "+getTransgression();
    }
    public int hashCode(){
        return Objects.hash (name,magic,transgression);
    }
    public int magicPower(Hogwarts  student){
        return student.getMagic()+student.getTransgression();
    }

    public void compareMagicPower (Hogwarts a) {
        if (magicPower(this)<magicPower(a)) {
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s.%n", a.getName(), this.getName());
        }
        else if (magicPower(this)>magicPower(a)){
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s.%n", this.getName(), a.getName());
        }
        else {
            System.out.printf("%s и %s обладают одинаковой мощностью магии.%n", this.getName(), a.getName());
        }


    }

    }





