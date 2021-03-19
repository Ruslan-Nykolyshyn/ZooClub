package com.company;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        Person person1 = new Person("Mark", 17);
        Person person2 = new Person("Karl", 20);
        Person person3 = new Person("Misha", 15);

        Animal cat1 = new Animal("Bob","cat");
        Animal cat2 = new Animal("Jerry","cat");
        Animal cat3 = new Animal("Cat","cat");
        Animal dog1 = new Animal("Berta","dog");
        Animal dog2 = new Animal("Popi","dog");
        Animal dog3 = new Animal("Gav","dog");

        Map<Person, List<Animal>> zooHome = new HashMap<>();
        zooHome.put(person1, Arrays.asList(cat1, dog1));
        zooHome.put(person2, Arrays.asList(cat2, dog2));
        zooHome.put(person3, Arrays.asList(cat3, dog3));

        System.out.println("ZooHome consists of: ");
        printMap(zooHome);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose-->\n" +
                "1 - add new person to zooHome\n" +
                "2 - add new animal to person\n" +
                "3 - take away an animal from person\n" +
                "4 - exclude person from zooHome\n" +
                "5 - print entire zooHome\n" +
                "6 - exit");
        do {
            int act = scanner.nextInt();
            if (act >= 1 && act <= 6){
                switch (act){
                    case 1:
                        zooHome.put(new Person(), new ArrayList<>());
                        System.out.println("Next chose-->");
                        break;
                    case 2:
                        addNewAnimalToPerson(zooHome);
                        System.out.println("Next chose-->");
                        break;
                    case 3:
                        removeAnimalFromPerson(zooHome);
                        System.out.println("Next chose-->");
                        break;
                    case 4:
                        removePerson(zooHome);
                        System.out.println("Next chose-->");
                        break;
                    case 5:
                        printMap(zooHome);
                        System.out.println("Next chose-->");
                        break;
                    case 6:
                        System.exit(0);





                }


            }else {
                System.out.println("Incorrect choice. Try again.");
            }
        } while (true);
    }


    private static void printMap(Map<Person, List<Animal>> zooHome) {
        for (Map.Entry<Person, List<Animal>> member : zooHome.entrySet()) {
            System.out.println(member.getKey() + " has = " + member.getValue());
        }
    }
    private static Map<Person, List<Animal>> addNewAnimalToPerson(Map<Person, List<Animal>> zooHome){

        Person person = checkPerson(zooHome);

        if (zooHome.containsKey(person)){
            List<Animal> animals = new ArrayList<>(zooHome.get(person));
            animals.add(new Animal());
            zooHome.put(person, animals);
        }
        return zooHome;
    }
    private static Person checkPerson(Map<Person, List<Animal>> zooClub){

        Person person = new Person();

        if (!zooClub.containsKey(person)){
            System.out.println("There is no such member in zooHome(");
        }
        return person;
    }
    private static Map<Person, List<Animal>> removeAnimalFromPerson(Map<Person, List<Animal>> zooHome) {

        Person person = checkPerson(zooHome);

        if (zooHome.containsKey(person)) {
            List<Animal> animals = new ArrayList<>(zooHome.get(person));
            System.out.println("Enter number of animal that should be taken away from " + person.getName() + ":");

            for (Animal animal : animals) {
                System.out.println((animals.indexOf(animal) + 1) + " - " + animal);
            }

            Scanner scanner = new Scanner(System.in);
            boolean a = true;

            while (a) {
                int i = scanner.nextInt();

                if (i <= 0 || i > animals.size()) {
                    System.out.println("Incorrect input. Try again:");
                } else {
                    animals.remove(i - 1);
                    zooHome.put(person, animals);
                    a = false;
                }
            }
        }
        return zooHome;
    }
    private static Map<Person, List<Animal>> removePerson(Map<Person, List<Animal>> zooHome){

        Person person = checkPerson(zooHome);

        if (zooHome.containsKey(person)){
            zooHome.remove(person);
        }
        return zooHome;
    }


}

