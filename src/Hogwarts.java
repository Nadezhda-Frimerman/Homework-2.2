import java.util.Objects;

public class Hogwarts {
    private final String name;
    private String surname;
    private int magic;
    private int transgression;

    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getSurname() {
        return surname;
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
        return getName()+" "+getSurname()+" волшебство - "+getMagic()+" трансгрессия - "+getTransgression();
    }
    public int hashCode(){
        return Objects.hash (name,surname,magic,transgression);
    }

    public void compare(Hogwarts a, Hogwarts b) {
        if (a.getMagic()+a.getTransgression()==b.getMagic()+b.getTransgression()) {
            System.out.printf("%s %s и %s %s обладают одинаковой мощностью магии.", a.getName(), a.getSurname(), b.getName(), b.getSurname());
        }
        if (a.getMagic()+a.getTransgression()>b.getMagic()+b.getTransgression()){
            System.out.printf("%s %s обладает бОльшей мощностью магии, чем %s %s", a.getName(), a.getSurname(), b.getName(), b.getSurname());
        }
        else {
            System.out.printf("%s %s обладает бОльшей мощностью магии, чем %s %s", b.getName(), b.getSurname(), a.getName(), a.getSurname());
        }


    }

    }





