package dogkennel;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class YardTest {

    @Test
    public void getAllDogs() {
        //nt id, String color, String breed, String dogname, String gender, String cityOrigin)
        Dog dog = new Dog(158683,"Brindle","Chihuahua X","GIZMO","Female","DAVOREN PARK",9);
        Dog dog2 = new Dog(158689,"Black","Greyhound","RORY","Male","ANGLE VALE",4);
        Dog dog3 = new Dog(158701,"Grey","Siberian Husky","OAKLEY","Male","CRAIGMORE",10);

        Yard yard = new Yard("box1");
        yard.addDogToYard(dog);
        yard.addDogToYard(dog2);
        List<Dog> myDogs = new ArrayList<>();
        myDogs = yard.getAllDogs();
        myDogs.add(dog3);
        List<Dog> myDogsAfter = new ArrayList<>();
        myDogsAfter = yard.getAllDogs();

    }
}