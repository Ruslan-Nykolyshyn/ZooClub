package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Person implements Comparable <Person> {
    private  String name;
    private  int age;
    Scanner scanner = new Scanner(System.in);

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public Person() {
        System.out.println("Enter person name-->");
        this.name = scanner.next();
        System.out.println("Enter person age-->");
        this.age = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
