public class Main {
    public static void main(String[] args) {
        Gryffindor potter=new Gryffindor("Harry Potter",87,65,75,56,55);
        Gryffindor granger=new Gryffindor("Hermione Granger",84,65,75,88,77);
        Gryffindor weasley=new Gryffindor("Ron Weasley",82,75,45,64,76);
        System.out.println(potter);
        System.out.println(granger);
        System.out.println(weasley);
        Slytherin malfoy = new Slytherin("Draco Malfoy",86,54,67,36,68,57,87);
        Slytherin montague = new Slytherin("Graham Montague",65,62,74,71,54,46,57);
        Slytherin goyle = new Slytherin("Gregory Goyle",65,57,41,43,45,56,46);
        System.out.println(malfoy);
        potter.compareMagicPower(malfoy);
        potter.compareByProperties(granger);
        montague.compareByProperties(goyle);
    }
}