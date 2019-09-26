package io.javabrains.unit2;

import sun.rmi.server.InactiveGroupException;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args){
        int [] somenumbers={1,2,3,4};
        int key=0;

        process(somenumbers,key,(v,k)-> System.out.println(v/k));
    }
    private static void process(int[] somenumbers, int key, BiConsumer<Integer, Integer> consumer){
        for(int i: somenumbers){
            consumer.accept(i,key);
        }
    }
}
