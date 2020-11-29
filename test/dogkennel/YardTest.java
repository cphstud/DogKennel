package dogkennel;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class YardTest {

    @org.junit.Test
    public void addDogToList() {
        Yard yard = new Yard();
        Dog dog = new Dog(21900,"Black","German Shepherd Dog","DOMINO","Desexed Female","MACDONALD PARK");
        Dog dog2 = new Dog(100268,"Tan","Tenterfield Terrier","CONAN","Male","BLAKEVIEW");
        Dog dog3 = new Dog(60736,"Fawn","Greyhound","LADY","Desexed Female","ELIZABETH NORTH");
        yard.addDogToList(dog);
        yard.addDogToList(dog2);

        Iterable<Dog> dogList = yard.getDogs();
        for (Dog d :dogList ) {
            System.out.println("D1 " +d);
        }
        dogList.forEach(System.out::println);
        Iterable<Dog> dogList2 = yard.getDogs();
        for (Dog d :dogList2 ) {
            System.out.println("D2 " +d);
        }

        Iterator<Dog> dogIterator = yard.getDogsI();
        while(dogIterator.hasNext()) {
            System.out.println("I " + dogIterator.next());
        }
        while(dogIterator.hasNext()) {
            dogIterator.remove();
        }
        Iterator<Dog> dogIterator2 = yard.getDogsI();
        while(dogIterator2.hasNext()) {
            System.out.println("I2 " + dogIterator2.next());
        }


    }

    @org.junit.Test
    public void getDogs() {
    }

    @org.junit.Test
    public void getDogsI() {
    }
}