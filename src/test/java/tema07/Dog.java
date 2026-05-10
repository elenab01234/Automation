package tema07;

// 1. Creează clasa Dog:
public class Dog {

    //    Atribute:
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    Metoda: bark() → afișează: „Câinele <name> latră”
    public void bark() {
        System.out.println("Cainele " + name + " latra");
    }

    //    Metoda: getAgeInHumanYears() → returnează age * 7
    public int getAgeInHumanYears() {
        return age * 7;
    }

    public static void main(String[] args) {
        //    creează 2 obiecte
        Dog dog1 = new Dog("Dogu1", 3);
        Dog dog2 = new Dog("Dogu2", 5);

        // Apel metode
        dog1.bark();
        System.out.println(dog1.name +" are " + dog1.getAgeInHumanYears() +" ani umani. ");
        System.out.println();

        dog2.bark();
        System.out.println(dog2.name +" are " + dog2.getAgeInHumanYears() +" ani umani. ");
    }

}