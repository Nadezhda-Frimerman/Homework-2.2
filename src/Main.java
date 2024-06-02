public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Harry Potter", 87, 65, 75, 56, 55);
        Gryffindor granger = new Gryffindor("Hermione Granger", 84, 65, 75, 88, 77);
        Gryffindor weasley = new Gryffindor("Ron Weasley", 82, 75, 45, 64, 76);
        System.out.println("факультет Гриффиндор.");
        System.out.println(potter);
        System.out.println(granger);
        System.out.println(weasley);
        potter.compareByProperties(granger);
        Slytherin malfoy = new Slytherin("Draco Malfoy", 86, 54, 67, 36, 68, 57, 87);
        Slytherin montague = new Slytherin("Graham Montague", 65, 62, 74, 71, 54, 46, 57);
        Slytherin goyle = new Slytherin("Gregory Goyle", 65, 57, 41, 43, 45, 56, 46);
        System.out.println(" ");
        System.out.println("факультет Слизерин.");
        System.out.println(malfoy);
        System.out.println(montague);
        System.out.println(goyle);
        montague.compareByProperties(goyle);
        Ravenclaw chang = new Ravenclaw("Zhou Chang", 65, 38, 57, 41, 48, 75);
        Ravenclaw patil = new Ravenclaw("Padma Patil", 53, 54, 57, 85, 86, 42);
        Ravenclaw belby = new Ravenclaw("Marcus Belby", 65, 84, 12, 35, 67, 85);
        System.out.println(" ");
        System.out.println("факультет Когтевран.");
        System.out.println(chang);
        System.out.println(patil);
        System.out.println(belby);
        belby.compareByProperties(patil);
        System.out.println(" ");
        System.out.println("факультет Пуффендуй.");
        Hufflepuff smith = new Hufflepuff("Zachariah Smith", 68, 54, 92, 54, 73);
        Hufflepuff diggory = new Hufflepuff("Cedric Diggory", 57, 58, 14, 59, 87);
        Hufflepuff fletchley = new Hufflepuff("Justin Finch-Fletchley", 65, 87, 56, 51, 42);
        System.out.println(smith);
        System.out.println(diggory);
        System.out.println(fletchley);
        smith.compareByProperties(diggory);
        System.out.println(" ");
        potter.compareMagicPower(malfoy);
    }
}