import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available animals");

        Class [] availableAnimals = {Cat.class, Dog.class, Cow.class};

        for (Class classAnimals: availableAnimals){
            System.out.println(classAnimals.getSimpleName());
        }

        System.out.println("How many pets do you have");

        int numberOfPets = scanner.nextInt();

        Animal [] animals = new Animal[numberOfPets];

        for (int i =0; i < animals.length; i++){
            System.out.println("what type of pet is pet" + " " + (i + 1));
            String type = scanner.next();
            if (type.equalsIgnoreCase("cow")){
                animals[i] = new Cow();
            } else if (type.equalsIgnoreCase("dog")) {
                animals[i] = new Dog();
            } else if (type.equalsIgnoreCase("cat")) {
                animals[i] = new Cat();
            } else {
                throw new IllegalArgumentException("please select valid animal");
            }
        }

        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].getName());
            animals[i].Speak();
        }


    }
}
