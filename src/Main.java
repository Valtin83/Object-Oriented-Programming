public class Main {
    public static void main(String[] args) {
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 90,
                85, 5, 5, 6);
        Gryffindor ron = new Gryffindor("Рон Уизли", 70, 75,
                3, 6, 5);

        Slytherin draco = new Slytherin("Драко Малфой", 80, 65,
                7, 8, 9);
        Slytherin goyle = new Slytherin("Грегори Гойл", 75, 60,
                5, 5, 6);

        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 57,65,
                5,8,6);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 87,75,
                7,8,9);

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 66, 56,
                5, 7, 6);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 68, 54,
                6, 6, 6);


        hermione.describe();
        ron.describe();
        Gryffindor.compare(hermione, ron);

        draco.describe();
        goyle.describe();
        Slytherin.compare(draco, goyle);

        zacharias.describe();
        cedric.describe();
        Hufflepuff.compare(zacharias, cedric);

        zhou.describe();
        padma.describe();
        Ravenclaw.compare(zhou, padma);

        Hogwarts.compareStudent(draco, hermione);
    }
}