class Hogwarts {
    protected String name;
    private int magicPower;
    private int transgressionDistance;

    // Конструктор
    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    // Метод, для вывода на экран описание студента
    public void describe() {
        System.out.println("Студент: " + getName() + ", Сила магии: " + getMagicPower() +
                ", Расстояние трансгрессии: " + getTransgressionDistance());
    }

    // Метод для сравнения учеников школы
    public static void compareStudent(Hogwarts student1, Hogwarts student2) {
        if (student1 == null || student2 == null) {
            System.out.println("Один из студентов не существует.");
            return;
        }
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println("Оба студента обладают равной мощностью магии.");
        }
    }
}

// Факультет Грифендор
class Gryffindor extends Hogwarts {
    private int bravery; // Храбрость
    private int honor; // Честь
    private int nobility; // Благородство

    public Gryffindor(String name, int magicPower, int transgressionDistance,
                      int bravery, int honor, int nobility) {
        super(name, magicPower, transgressionDistance);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    // Описание учеников факультета
    @Override
    public void describe() {
        super.describe();
        System.out.println("Храбрость: " + getBravery() + ", Честь: " + getHonor() +
                ", Благородство: " + getNobility());
    }

    // Метод сравнения учеников факультета
    public static void compare(Gryffindor student1, Gryffindor student2) {
        int score1 = student1.getBravery() + student1.getHonor() + student1.getNobility();
        int score2 = student2.getBravery() + student2.getHonor() + student2.getNobility();
        if (score1 > score2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println("Оба студента равны по очкам Гриффиндора.");
        }
    }
}

// Факультет Слизерин
class Slytherin extends Hogwarts {
    private int cunning; // Хитрость
    private int determination; // Решительность
    private int ambition; // Амбиция

    public Slytherin(String name, int magicPower, int transgressionDistance,
                     int cunning, int determination, int ambition) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    // Описание учеников факультета
    @Override
    public void describe() {
        super.describe();
        System.out.println("Хитрость: " + getCunning() + ", Решительность: " + getDetermination() +
                ", Амбиция: " + getAmbition());
    }

    // Метод сравнения учеников факультета
    public static void compare(Slytherin student1, Slytherin student2) {
        int score1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition();
        int score2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition();
        if (score1 > score2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else {
            System.out.println("Оба студента равны по очкам Слизерина.");
        }
    }
}

// Факультет Пуффендуй
class Hufflepuff extends Hogwarts {
    private int loyalty; // Верность
    private int honesty; // Честность
    private int workEthic; // Трудолюбие

    public Hufflepuff(String name, int magicPower, int transgressionDistance,
                      int loyalty, int honesty, int workEthic) {
        super(name, magicPower, transgressionDistance);
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.workEthic = workEthic;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getWorkEthic() {
        return workEthic;
    }

    public void setWorkEthic(int workEthic) {
        this.workEthic = workEthic;
    }

    // Описание учеников факультета
    @Override
    public void describe() {
        super.describe();
        System.out.println("Верность: " + getLoyalty() + ", Честность: " + getHonesty() +
                ", Трудолюбие: " + getWorkEthic());
    }

    // Метод сравнения учеников факультета
    public static void compare(Hufflepuff student1, Hufflepuff student2) {
        int score1 = student1.getLoyalty() + student1.getHonesty() + student1.getWorkEthic();
        int score2 = student2.getLoyalty() + student2.getHonesty() + student2.getWorkEthic();
        if (score1 > score2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println("Оба студента равны по очкам Пуффендуя.");
        }
    }
}

// Факультет Когтевран
class Ravenclaw extends Hogwarts {
    private int wisdom; // Мудрость
    private int wit; // Остроумие
    private int creativity; // Творчество

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int wisdom,
                     int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    // Описание учеников факультета
    @Override
    public void describe() {
        super.describe();
        System.out.println("Мудрость: " + getWisdom() + ", Остроумие: " + getWit() +
                ", Творчество: " + getCreativity());
    }

    // Метод сравнения учеников факультета
    public static void compare(Ravenclaw student1, Ravenclaw student2) {
        int score1 = student1.getWisdom() + student1.getWit() + student1.getCreativity();
        int score2 = student2.getWisdom() + student2.getWit() + student2.getCreativity();
        if (score1 > score2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println("Оба студента равны по очкам Когтеврана.");
        }
    }
}