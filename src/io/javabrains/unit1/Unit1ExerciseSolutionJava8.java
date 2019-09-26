package io.javabrains.unit1;

import java.util.*;

public class Unit1ExerciseSolutionJava8 {
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
        Collections.sort(people, (o1, o2) ->o1.getLastName().compareTo(o2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        System.out.println("Step 2:");
        printConditionally(people,p->true);
        // Step 3: Create a method that prints all people that have last name beginning with C
        System.out.println("Step 3:");
        printConditionally(people, p->p.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people,Condition condition) {
        for(Person p: people){
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }

}
