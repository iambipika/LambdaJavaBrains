package io.javabrains.unit1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.javabrains.unit1.Person;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        System.out.println("Step 1:");
        ArrayList<String> last = new ArrayList<String>();
        for (Person p : people) {
            last.add(p.getLastName());
        }

        Collections.sort(last);
        ArrayList<Person> sorted = new ArrayList<Person>();

        for (String l : last) {
            for (Person pp : people) {
                if (pp.getLastName().equals(l)) {
                    sorted.add(pp);
                }
            }
        }
        for (Person s : sorted) {
            System.out.println(s);
        }
        System.out.println("Step 2:");
        // Step 2: Create a method that prints all elements in the list
        printEle(people);

        System.out.println("Step 3:");
        // Step 3: Create a method that prints all people that have last name beginning with C
        printCLast(people);


    }
    public static void printEle(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    public static void printCLast(List<Person> people) {
        ArrayList<Person> per = new ArrayList<Person>();
        for (Person p : people) {
            String lastname = p.getLastName();
            if (lastname.substring(0, 1).equals("C")) {
                per.add(p);
                System.out.println(p);
            }
        }
    }
}