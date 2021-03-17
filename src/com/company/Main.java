package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        Map<Person, List <Animal>> Zoo = new HashMap<Person,List <Animal>>();
        Zoo.put(new Person("Mark",23), (List<Animal>) new Animal("Bob","cat"));
        Zoo.put(new Person("Karl",31), (List<Animal>) new Animal("Tom","cat"));
        Zoo.put(new Person("Jon",19), (List<Animal>) new Animal("Jerry","dog"));
        Zoo.put(new Person("Ruslan",18), (List<Animal>) new Animal("Topic","dog"));
        Zoo.put(new Person("Oleh",14), (List<Animal>) new Animal("Berta","dog"));

        //dodatu people v club
        System.out.println("Додати людину----->");
        Person person = new Person("Slavik",18);
        Animal animal = new Animal("Maks","dog");
        List<Animal> put = Zoo.put(person, (List<Animal>) animal);
        printMap(Zoo);

        //remove animal vid people
        System.out.println("Забрати тваринку від людини---->");
        List<Animal> remove = Zoo.remove((List<Animal>) animal);
        printMap(Zoo);

        //remove people with club
        System.out.println("Видалити людину---> ");
        Zoo.remove(new Person("Mark",23));
        printMap(Zoo);

        //vuvestu na ekran
        for (Map.Entry<Person, List<Animal>> entry : Zoo.entrySet()){
            System.out.println(entry);

        }




    }
    //private static void changeAnimal(Map<Person, List<Animal>> Zoo,
            //                          Person person,
          //                            Animal zoos) {
        //if (Zoo.containsKey(person)) {
            //Zoo.put(person, zoos);
            //System.out.println("Animal was changed.");
        //} else {
          //  System.out.println("Person is not found.");
      //  }
    //}

    private static void printMap(Map<Person, List<Animal>> Zoo) {
        for (Map.Entry<Person, List<Animal>> zoos : Zoo.entrySet()) {
            System.out.println("Key = " + zoos.getKey() + " / Value = " + zoos.getValue());
        }
    }
}
