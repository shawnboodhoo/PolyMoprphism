import java.util.Scanner;

public class Animal {

    private String name;

    Scanner scanner = new Scanner(System.in);


    public Animal() {
        System.out.println("whats yor pet's name");
      name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Speak(){
        System.out.println(name + " " + "is making noise");
    }



}
