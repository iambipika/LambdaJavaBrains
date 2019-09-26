package SelfTest;

import java.util.ArrayList;
import java.util.List;

public class Recursion1 {
    public int iterate(List<Integer> lst){
        int sum=0;
        for (int i : lst){
            sum=i+sum;
        }
        return sum;
    }

    public int recurse(List<Integer> lst) {
        int size = lst.size();
        if(size==0){return 0;}
        int val = lst.get(size - 1);
        return recurse(lst.subList(0, size - 1))+val;
    }
    public static void main(String[] args){
        Recursion1 recur=new Recursion1();
        List<Integer> num=new ArrayList<Integer>();
        num.add(4);
        num.add(2);
        num.add(3);num.add(1);num.add(5);
        int total=recur.iterate(num);
        int rectot=recur.recurse(num);
        System.out.println("Iteration: "+total);
        System.out.println("Recursion: "+rectot);
    }
}
