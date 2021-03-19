package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Animal {
    private String nameAnimal;
    private String kindAnimal;
    Scanner scanner = new Scanner(System.in);

    public Animal(String nameAnimal, String kindAnimal) {
        this.nameAnimal = nameAnimal;
        this.kindAnimal = kindAnimal;
    }
    public Animal() {
        System.out.println("Enter Animal kind-->");
        this.nameAnimal = scanner.next();
        System.out.println("Enter Animal kind-->");
        this.kindAnimal = scanner.next();
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getKindAnimal() {
        return kindAnimal;
    }

    public void setKindAnimal(String kindAnimal) {
        this.kindAnimal = kindAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return nameAnimal.equals(animal.nameAnimal) && kindAnimal.equals(animal.kindAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAnimal, kindAnimal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", kindAnimal='" + kindAnimal + '\'' +
                '}';
    }
}
