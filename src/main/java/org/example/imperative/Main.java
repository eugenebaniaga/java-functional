package org.example.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Eugene", Gender.MALE),
                new Person("Eulia", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        //IMPERATIVE
        List<Person> females = new ArrayList<>();
        for (Person p : people) {
            if(Gender.FEMALE.equals(p.gender)){
                females.add(p);
            }
        }

        for(Person female : females){
            System.out.println(female);
        }

        System.out.println("---------");
        //DECLARATIVE with streams
       List<Person> females2 = people.stream()
               .filter( p -> p.gender.equals(Gender.FEMALE)).toList();

        System.out.println(females2);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person( String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}