package dogkennel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Yard {
    private final List<Dog> dogs;
    private final Set<Dog> dogsS;
    private final String yardName;

    public Yard(String yardName) {
        this.yardName = yardName;
        this.dogs = new ArrayList<>();
        this.dogsS = new HashSet<>();
    }

    public boolean addDogToYardS(Dog dog) {
        boolean retVal = false;
        retVal= this.dogsS.add(dog);
        return retVal;
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
