package dogkennel;

import java.util.ArrayList;
import java.util.List;

public class Yard {
    private final List<Dog> dogs;
    private final String yardName;

    public Yard(String yardName) {
        this.yardName = yardName;
        this.dogs = new ArrayList<>();
    }

    public boolean addDogToYard(Dog dog) {
        boolean dogAdded = false;
        dogAdded = dogs.add(dog);
        return dogAdded;
    }

    public List<Dog> getAllDogs() {
        return this.dogs;
    }

    public List<Dog> getDogFromYard(String searchItem) {
        List<Dog> dogs = new ArrayList<>();
        for (Dog d :dogs ) {
            if (d.getName().contains(searchItem)) {
                dogs.add(d);
            }
        }
        return dogs;
    }

}
