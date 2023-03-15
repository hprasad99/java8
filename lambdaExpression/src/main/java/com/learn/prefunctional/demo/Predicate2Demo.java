package com.learn.prefunctional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate2Demo {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter((t) -> t%2==0).forEach(t -> System.out.println("Print Even: "+ t));
    }
}
