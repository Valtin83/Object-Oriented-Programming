public class Main {
    public static void main(String[] args) {
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 90,
                75, 5, 5, 6);
        Gryffindor ron = new Gryffindor("Рон Уизли", 70, 75,
                3, 6, 5);

        Slytherin draco = new Slytherin("Драко Малфой", 80, 65,
                7, 8, 9);
        Slytherin goyle = new Slytherin("Грегори Гойл", 75, 60,
                5, 5, 6);

        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 57, 65,
                5, 8, 6);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 87, 75,
                7, 8, 9);

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 66, 56,
                5, 7, 6);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 68, 54,
                6, 6, 6);

        // Описание студентов
        System.out.println("Описание студентов:");

        hermione.describe();
        ron.describe();

        draco.describe();
        goyle.describe();

        zacharias.describe();
        cedric.describe();

        zhou.describe();
        padma.describe();

        // Сравнение студентов внутри факультета
        System.out.println("Сравнение студентов внутри факультетов:");

        Gryffindor.compare(hermione, ron);
        Slytherin.compare(draco, goyle);
        Hufflepuff.compare(zacharias, cedric);
        Ravenclaw.compare(zhou, padma);

        // Сравнение студентов по магической силе между факультетами
        System.out.println("Сравнение студентов по магической силе:");

        Hogwarts.compareMagicPower(draco, hermione);
    }
}