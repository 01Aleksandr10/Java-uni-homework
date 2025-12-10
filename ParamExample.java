import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class ParamExample {
    public static void main(String[] args) {
        // Практика 1
        Wrapper<Integer> intWrapper = new Wrapper<>();
        Wrapper<String> stringWrapper = new Wrapper<>();

        if (intWrapper instanceof Wrapper<?>) {
            System.out.println("intWrapper is a Wrapper of some type");
        }

        if (stringWrapper instanceof Wrapper<String>) {
            System.out.println("stringWrapper is a Wrapper<String>");
        }

        if (intWrapper instanceof Wrapper<Integer>) {
            System.out.println("intWrapper is a Wrapper<Integer>");
        }

        // Практика 2
        List<Dog> dogs = Arrays.asList(new Dog(), new Labrador());
        processAnimals(dogs);

        List<Animal> animalsList = new ArrayList<>();
        addDogs(animalsList);
    }

    public static void processAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void addDogs(List<? super Dog> dogs) {
        dogs.add(new Dog());
        dogs.add(new Labrador());
        Object obj = dogs.get(0);
    }
}

class Wrapper<T> {}

class Animal {}

class Dog extends Animal {}

class Labrador extends Dog {}