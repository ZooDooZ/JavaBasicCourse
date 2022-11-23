package exercise30GenericTypes.Task2Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo <T extends Animal>{

    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal){
        animals.add(animal);
    }

    public void printAllAnimals(){
        for(Animal animal : animals){
            System.out.println(animal);
        }
    }
}
