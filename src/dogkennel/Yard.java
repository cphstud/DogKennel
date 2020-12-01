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
        /*
        if (dogs.size() < 2) {
            dogAdded = dogs.add(dog);
        }
         */
        if (!dogs.contains(dog)) {
           dogAdded=dogs.add(dog);
        }
        return dogAdded;
    }

    public List<Dog> getAllDogs() {
        return this.dogs;
    }

    public List<Dog> getDogFromYard(String searchItem) {
        List<Dog> retValDogs = new ArrayList<>();
        for (Dog d :this.dogs ) {
            if (d.getName().contains(searchItem)) {
                retValDogs.add(d);
            }
        }
        return dogs;
    }

}
