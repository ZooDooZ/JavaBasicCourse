package exercise27HashSetChallenge;

import java.util.Objects;

public class Car {

    private String name;
    private String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return this.name.equals(car.name) && this.model.equals(car.model);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, model);
    }


}
