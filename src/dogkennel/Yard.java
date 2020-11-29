package dogkennel;

import java.util.*;

public class Yard {
    private  final List<Dog> dogs;
    private  final List<Dog> dogsU;
    Set<Dog> dogsS;
    Set<Dog> dogsST;
    Map<String,Dog> dogsM;

    public Yard() {
        dogs = new ArrayList<>();
        dogsS = new HashSet<>();
        dogsST = new TreeSet<>();
        dogsM = new HashMap<>();
        dogsU = Collections.unmodifiableList(dogs);
    }

    public void addDogToList(Dog dog) {
        dogs.add(dog);
    }
    public Iterable<Dog> getDogs() {
        return this.dogs;
    }
    public Iterator<Dog> getDogsI() {
        Iterator it = dogs.iterator();
        return it;
    }
}
