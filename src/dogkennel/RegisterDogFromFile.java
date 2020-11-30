/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogkennel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thor
 */
public class RegisterDogFromFile {
    public List<Dog> importDogsFromCSV(String filename) {
        List<Dog> dogs = new ArrayList<>();
        File file = new File("resources/dogs.csv");
        FileReader fr;

        {
            try {
                fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = "";
                while ((line=br.readLine())!=null) {
                    String[] myArr = line.split(",");
                    Dog tmpDog = new Dog(Integer.parseInt(myArr[0]), myArr[1], myArr[4], myArr[1], myArr[2], myArr[5]);

                    //Reference,Colour_Description,Breed_Description,Animal_Name,Gender,Suburb
                    //int id, String color, String breed, String dogname, String gender, String cityOrigin)
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dogs;
    }
}

