package io.javabrains.unit3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import io.javabrains.unit1.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        people.stream()
                .filter(p->p.getLastName().startsWith("C"))
                .forEach(p-> System.out.println(p.getLastName()));

        List<Integer> numbers= Arrays.asList(4,6,8,13,3,15);
        numbers.stream().forEach(element-> System.out.println("Element: "+element));
        int sum= numbers.stream().reduce(0,(number1,number2)->number1+number2);
        int sumodd = getSumoddfp(numbers);
        System.out.println(sumodd);
    }

    public static int getSumoddfp(List<Integer> numbers) {
        return numbers.stream()
                    .filter(element->element%2==1)
                    .reduce(0,(number1,number2)->number1+number2);
    }
}
