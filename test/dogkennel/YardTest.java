package dogkennel;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class YardTest {

    @Test
    public void getAllDogs() {
        //nt id, String color, String breed, String dogname, String gender, String cityOrigin)
        //Dog dog = new Dog(158683,"Brindle","Chihuahua X","GIZMO","Female","DAVOREN PARK",9);
        Dog dog = new Dog(158589,"Tan/White","Akita","YOGI","Male","CRAIGMORE",3);
        Dog dog1 = new Dog(158683,"Brindle","Chihuahua X","GIZMO","Female","DAVOREN PARK",9);
        Dog dog2 = new Dog(158689,"Black","Greyhound","RORY","Male","ANGLE VALE",4);
        Dog dog3 = new Dog(158701,"Grey","Siberian Husky","OAKLEY","Male","CRAIGMORE",10);
        Dog dog4 = new Dog(158705,"White","Mastiff X","SPIKE","Male","CRAIGMORE",9);
        Dog dogx = new Dog(158655,"White","Bulldog","SPOT","Male","VIRGINIA",9);
        Dog dog5 = new Dog(158570,"White","Maltese","MADDY","Female","DAVOREN PARK",10);
        Dog dog6 = new Dog(158571,"Tan/White","Shar Pei","DAKOTA","Male","MUNNO PARA WEST",10);

        Yard yard = new Yard("box1");
        yard.addDogToYard(dog);
        yard.addDogToYard(dog1);
        yard.addDogToYard(dog2);
        yard.addDogToYard(dog3);
        yard.addDogToYard(dog4);
        yard.addDogToYard(dog5);
        yard.addDogToYard(dog6);
        // set
        yard.addDogToYardS(dog);
        yard.addDogToYardS(dog1);
        yard.addDogToYardS(dog2);
        yard.addDogToYardS(dog3);
        // get dog
        List<Dog> myDogsFound = new ArrayList<>();
        myDogsFound = yard.getDogFromYard("GIZMO");
        Dog dogF = myDogsFound.get(0);
        String n = dogF.getName();
        int age = dogF.getAge();
        age = 23;
        System.out.println(dogx.hashCode());
        System.out.println(dogF.hashCode());
        dogF = dogx;
        System.out.println("----");
        System.out.println(dogx.hashCode());
        System.out.println(dogF.hashCode());

        Iterable<Dog> it = new ArrayList();
        //Iterable it = yard.getAllDogsIter();
        it = yard.getAllDogsIter();
        for (Dog d :it ) {
            System.out.println("IT: " + d);
        }

        List<Dog> myDogs = new ArrayList<>();
        myDogs.add(dog4);
        System.out.println(myDogs.hashCode());
        myDogs = yard.getAllDogs();
        System.out.println(myDogs.hashCode());
        myDogs.add(dog3);
        List<Dog> myDogsAfter = new ArrayList<>();
        myDogsAfter = yard.getAllDogs();
        System.out.println(myDogsAfter);
        //Collections.sort(myDogsAfter);
        Collections.sort(myDogsAfter,new AgeComparator());
        System.out.println(myDogsAfter);
        Collections.sort(myDogsAfter,new AgeComparator().thenComparing(new GenderComparator()));
        System.out.println(myDogsAfter);
    }
}