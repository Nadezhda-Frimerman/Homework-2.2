public class Main {
    public static void main(String[] args) {
        Gryffindor potter=new Gryffindor("Harry Potter",87,65,75,56,55);
        Gryffindor granger=new Gryffindor("Hermione Granger",84,65,75,88,77);
        Gryffindor weasley=new Gryffindor("Ron Weasley",82,75,45,64,76);
        System.out.println(potter.toString());
        System.out.println(granger.toString());
        potter.compareMagicPower(granger);
        potter.compareByProperties(granger);
    }
}