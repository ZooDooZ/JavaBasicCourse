package exercise30GenericTypes.Task2Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo<Animal> zooList = new Zoo<>();

        zooList.addAnimal(new Tiger("Tiger", 8));
        zooList.addAnimal(new Tiger("Tigerek", 5));
        zooList.addAnimal(new Lion("Lion", 6));
        zooList.addAnimal(new Lion("Lionek", 2));

        zooList.printAllAnimals();

    }
}
