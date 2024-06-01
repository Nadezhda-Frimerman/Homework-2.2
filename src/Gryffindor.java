import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int magic,
                      int transgression, int nobility, int honor,int courage) {
        super(name, surname, magic, transgression);
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
        return getName()+" "+getSurname()+" волшебство - "+getMagic()+" трансгрессия - "+getTransgression()
                +" благородство - "+getNobility()+" честь - "+getHonor()+" храбрость - "+getCourage();
    }
    public int hashCode(){
        return Objects.hash (name,surname,magic,transgression,nobility,honor,courage);
    }

    public void compare(Gryffindor a, Gryffindor b) {
        if (a.getMagic()+a.getTransgression()+a.getNobility()+a.getHonor()+a.getCourage()
                ==b.getMagic()+b.getTransgression()+b.getNobility()+b.getHonor()+b.getCourage()) {
            System.out.printf("%s %s и %s %s обладают одинаковой мощностью магии.", a.getName(), a.getSurname(), b.getName(), b.getSurname());
        }
        if (a.getMagic()+a.getTransgression()+a.getNobility()+a.getHonor()+a.getCourage()
                >b.getMagic()+b.getTransgression()+b.getNobility()+b.getHonor()+b.getCourage()){
            System.out.printf("%s %s лучший Гриффиндорец, чем %s %s", a.getName(), a.getSurname(), b.getName(), b.getSurname());
        }
        else {
            System.out.printf("%s %s лучший Гриффиндорец, чем %s %s", b.getName(), b.getSurname(), a.getName(), a.getSurname());
        }
    }

}
